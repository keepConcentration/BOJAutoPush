import java.io.*;

import static java.lang.Integer.parseInt;

public class Main {

    static StringBuilder sb = new StringBuilder();

    static String[] strArr;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = parseInt(br.readLine());
        strArr = new String[N];
        Character targetStartStr = null,
                targetEndStr = null;
        int targetIndex = Integer.MAX_VALUE;
        for (int i = 0; i < N; ++i) {
            strArr[i] = br.readLine();
            if ("?".equals(strArr[i])) {
                targetIndex = i;
                if (i > 0) {
                    targetStartStr = strArr[i - 1].charAt(strArr[i - 1].length() - 1);
                }
            }
            if (targetIndex + 1 == i) {
                targetEndStr = strArr[i].charAt(0);
            }
        }

        int M = parseInt(br.readLine());
        for (int i = 0; i < M; ++i) {
            String str = br.readLine();
            if (sb.length() != 0) {
                continue;
            }

            if (N == 1) {
                sb.append(str);
                continue;
            }
            if (isDuplicated(str)) {
                continue;
            }
            char start = str.charAt(0);
            char end = str.charAt(str.length() - 1);
            if (targetStartStr != null && targetEndStr != null) {
                if (start == targetStartStr && end == targetEndStr) {
                    sb.append(str);
                    continue;
                }
                continue;
            }
            if (targetStartStr != null) {
                if (start == targetStartStr) {
                    sb.append(str);
                    continue;
                }
                continue;
            }
            if (targetEndStr != null) {
                if (end == targetEndStr) {
                    sb.append(str);
                }
            }
        }
        sb.append("\n");

        br.close();
        bw.write(sb.toString());
        bw.flush();
        bw.close();
    }

    private static boolean isDuplicated(String str) {
        for (int j = 0; j < strArr.length; ++j) {
            String beforeStr = strArr[j];
            if (beforeStr.equals(str)) {
                return true;
            }
        }
        return false;
    }
}
