import java.io.*;

class Main {

    static int K;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();

        String[] strArr = br.readLine().split(" ");
        int N = Integer.parseInt(strArr[0]);
        K = Integer.parseInt(strArr[1]);

        int[] arr = new int[N];
        strArr = br.readLine().split(" ");
        for (int i = 0; i < N; ++i) {
            arr[i] = Integer.parseInt(strArr[i]);
        }

        int count = insertionSort(arr);

        if (count == -1) {
            sb.append(-1);
        } else {
            for (int a : arr) {
                sb.append(a).append(" ");
            }
        }

        br.close();
        bw.write(sb.toString());
        bw.flush();
        bw.close();
    }

    private static int insertionSort(int[] arr) {
        int count = 0;
        for (int i = 1; i < arr.length; ++i) {
            int loc = i - 1; // 1
            int newItem = arr[i];  // 1

            while (0 <= loc && newItem < arr[loc]) {
                arr[loc + 1] = arr[loc];
                count++;
                loc--;
                if (count == K) {
                    return count;
                }
            }
            if (loc + 1 != i) {
                arr[loc + 1] = newItem;
                count++;
                if (count == K) {
                    return count;
                }
            }
        }
        return -1;
    }
}