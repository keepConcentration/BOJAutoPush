import java.io.*;

class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();

        boolean[] prime = new boolean[1003002];
        prime[0] = prime[1] = true;

        for (int i = 2; i <= 1003001; ++i) {
            if (!prime[i]) {
                for (int j = i + i; j <= 1003001; j += i) {
                    prime[j] = true;
                }
            }
        }
        String in = br.readLine();
        int N = Integer.parseInt(in);
        for (int i = N; i <= 1003001; ++i) {
            if (!prime[i] && isPalindrome(String.valueOf(i).split(""))) {
                sb.append(i).append("\n");
                break;
            }
        }

        bw.write(sb.toString());
        bw.flush();
        bw.close();
    }

    private static boolean isPalindrome(String[] str) {
        return recursion(str, 0, str.length - 1);
    }

    private static boolean recursion(String[] str, int left, int right) {
        if (str[right] == null) {
            return recursion(str, left, right - 1);
        }
        if (!str[left].equals(str[right])) {
            return false;
        }
        if (left >= right) {
            return true;
        }
        return recursion(str, left + 1, right - 1);
    }
}