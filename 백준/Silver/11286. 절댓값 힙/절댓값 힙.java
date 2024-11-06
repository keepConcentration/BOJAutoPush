import java.io.*;
import java.math.BigInteger;

import static java.lang.Integer.parseInt;

class Main {

    static StringBuilder sb = new StringBuilder();

    static Integer[] minAbsHeap = new Integer[100001];
    static int lastIndex = 0;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = parseInt(br.readLine());

        while (N-- > 0) {
            String in = br.readLine();
            if ("0".equals(in)) {
                sb.append(poll()).append("\n");
                continue;
            }
            add(parseInt(in));
        }

        br.close();
        bw.write(sb.toString());
        bw.flush();
        bw.close();
    }

    private static int poll() {
        if (lastIndex == 0) {
            return 0;
        }
        int poll = minAbsHeap[1];
        minAbsHeap[1] = minAbsHeap[lastIndex];
        minAbsHeap[lastIndex--] = null;

        for (int i = 1; i * 2 <= lastIndex;) {
            int iValue = minAbsHeap[i];
            int absI = Math.abs(iValue);

            int leftIndex = i * 2;
            int rightIndex = leftIndex + 1;

            int leftValue = minAbsHeap[leftIndex];
            int absLeft = Math.abs(leftValue);
            if (minAbsHeap[rightIndex] == null) {
                if (absLeft < absI || absLeft == absI && leftValue < iValue) {
                    swap(leftIndex, i);
                }
                break;
            }

            int rightValue = minAbsHeap[rightIndex];
            int absRight = Math.abs(rightValue);
            if (absLeft > absI && absRight > absI) {
                break;
            }
            if (absLeft > absRight) {
                swap(rightIndex, i);
                i = rightIndex;
                continue;
            }
            if (absLeft < absRight) {
                swap(leftIndex, i);
                i = leftIndex;
                continue;
            }

            if (absLeft == absRight) {
                if (leftValue == rightValue) {
                    // 모두 같을 경우
                    if (iValue == leftValue) {
                        break;
                    }
                    // 상위가 더 클 경우
                    if (absI > leftValue) {
                        swap(leftIndex, i);
                        i = leftIndex;
                        continue;
                    }
                    break;
                }
                if (leftValue < rightValue) {
                    if (absI > leftValue) {
                        swap(i, leftIndex);
                        i = leftIndex;
                        continue;
                    }
                } else {
                    if (absI > rightValue) {
                        swap(i, rightIndex);
                        i = rightIndex;
                        continue;
                    }
                }

                // left != right, absL == absR
                if (absI > absLeft) {
                    swap(leftIndex, i);
                    i = leftIndex;
                    continue;
                }
                if (absI > absRight) {
                    swap(rightIndex, i);
                    i = rightIndex;
                    continue;
                }
                break;
            }
        }
        return poll;
    }

    private static void add(int a) {
        minAbsHeap[++lastIndex] = a;
        for (int i = lastIndex; i / 2 > 0;) {
            int iValue = minAbsHeap[i];
            int absI = Math.abs(iValue);

            int parentIndex = i / 2;
            int parentValue = minAbsHeap[parentIndex];
            int absParent = Math.abs(parentValue);

            if (absI < absParent || absI == absParent && iValue < parentValue) {
                swap(parentIndex, i);
                i = parentIndex;
            } else {
                break;
            }
        }
    }

    private static void swap(int a, int b) {
        int temp = minAbsHeap[a];
        minAbsHeap[a] = minAbsHeap[b];
        minAbsHeap[b] = temp;
    }
}