import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();

        int T = Integer.parseInt(br.readLine());

        l:while (T-- > 0) {
            long in = Long.parseLong(br.readLine());
            for (int i = 2; i < 65; ++i) {
                long M = in;
                if (M < 65) {
                    sb.append("1\n");
                    continue l;
                }

                StringBuilder out = new StringBuilder();
                while (M != 0) {
                    int remain = (int) M % i;
                    M /= i;

                    out.insert(0, remain + ",");
                }
                out.deleteCharAt(out.length() - 1);

                String[] strArr = out.toString().split(",");
                
                for (int j = strArr.length - 1; j >= 0; --j) {
                    if (strArr[j].equals("0")) {
                        strArr[j] = null;
                    } else {
                        break;
                    }
                }

                if (isPalindrome(out.toString().split(","))) {
                    sb.append("1\n");
                    continue l;
                }
            }
            sb.append("0\n");
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