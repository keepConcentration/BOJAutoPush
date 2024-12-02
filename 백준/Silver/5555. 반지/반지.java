import java.io.*;
import java.util.ArrayDeque;

import static java.lang.Integer.parseInt;

public class Main {

    static final StringBuilder sb = new StringBuilder();
    static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static final BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String[] args) throws IOException {
        String str = br.readLine();

        int T = parseInt(br.readLine());
        int result = 0;
        while (T-- > 0) {
            char[] charArr = br.readLine().toCharArray();
            ArrayDeque<Character> stack = new ArrayDeque<>();

            for (int i = 0; i < charArr.length; ++i) {
                stack.offerLast(charArr[i]);
            }

            int loopNum = charArr.length + str.length();

            String targetStr = "";
            for (int i = 0; i < loopNum; ++i) {
                char pop = stack.pollFirst();
                if (targetStr.length() != str.length()) {
                    targetStr += pop;
                } else {
                    targetStr = targetStr.substring(1);
                    targetStr += pop;
                }
                if (targetStr.equals(str)) {
                    result++;
                    break;
                }
                stack.offerLast(pop);
            }
        }

        sb.append(result).append("\n");

        bw.write(sb.toString());
        bw.flush();
        bw.close();
        br.close();
    }
}
