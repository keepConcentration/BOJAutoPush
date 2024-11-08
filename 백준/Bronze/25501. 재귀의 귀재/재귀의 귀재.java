import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

class Main {
    static int callCount = 0;

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();
        int N = Integer.parseInt(br.readLine());


        for (int i = 0; i < N; ++i) {
            callCount = 0;
            boolean result = isPalindrome(br.readLine());
            sb.append(result ? 1 : 0).append(" ").append(callCount).append("\n");
        }


        bw.write(sb.toString());
        bw.flush();
        bw.close();
    }

    static boolean isPalindrome(String s) {
        if (recursion(s, 0, s.length() - 1) > 0) {
            return true;
        }
        return false;
    }

    static int recursion(String s, int left, int right) {
        callCount++;
        if (left >= right) {
            return 1;
        }
        if (s.charAt(left) != s.charAt(right)) {
            return 0;
        }
        return recursion(s, left + 1, right - 1);
    }
}