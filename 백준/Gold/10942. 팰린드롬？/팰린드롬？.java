import java.io.*;

import static java.lang.Integer.parseInt;

public class Main {

    static StringBuilder sb = new StringBuilder();

    static int N;
    static int M;

    static Boolean[][] isPalindrome;

    static int[] arr;


    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        N = parseInt(br.readLine());
        isPalindrome = new Boolean[N + 1][N + 1];
        arr = new int[N + 1];

        String[] strArr = br.readLine().split(" ");
        for (int i = 1; i <= N; ++i) {
            arr[i] = parseInt(strArr[i - 1]);
            isPalindrome[i][i] = true;
            if (i != 1) {
                if (arr[i - 1] == arr[i]) {
                    isPalindrome[i - 1][i] = true;
                }
            }
        }
        M = parseInt(br.readLine());

        while (M-- > 0) {
            strArr = br.readLine().split(" ");
            int startIndex = parseInt(strArr[0]);
            int endIndex = parseInt(strArr[1]);
            sb.append(isPalindrome(startIndex, endIndex) ? "1\n" : "0\n");
        }

        bw.write(sb.toString());
        bw.flush();
        bw.close();
        br.close();
    }

    private static boolean isPalindrome(int start, int end) {
        if (isPalindrome[start][end] != null) {
            return isPalindrome[start][end];
        }

        int left = (start + end) / 2;
        int right = (start + end) / 2 + 1;
        if ((start + end) % 2 == 0) {
           left -= 1;
        }
        boolean prevVal = true;
        while (start <= left && right <= end) {
            if (!prevVal) {
                isPalindrome[left][right] = false;
            } else {
                if (arr[left] == arr[right]) {
                    isPalindrome[left][right] = true;
                } else {
                    isPalindrome[left][right] = false;
                    prevVal = false;
                }
            }
            left--;
            right++;
        }
        return isPalindrome[start][end];
    }

}
