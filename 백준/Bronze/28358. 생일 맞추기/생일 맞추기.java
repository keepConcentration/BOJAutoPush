import java.io.*;

import static java.lang.Integer.parseInt;

public class Main {

    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int[] days = new int[] {0, 31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

        String[] year = new String[366];
        int idx = 0;
        for (int i = 1; i <= 12; ++i) {
            for (int j = 1; j <= days[i]; ++j) {
                year[idx] = String.valueOf(i) + j;
                idx++;
            }
        }

        int T = parseInt(br.readLine());
        while (T-- > 0) {
            String[] strArr = br.readLine().split(" ");
            int result = 0;
            for (int i = 0; i < year.length; ++i) {
                boolean contains = false;
                for (int j = 0; j < strArr.length; ++j) {
                    String targetNum = String.valueOf(j);
                    if (strArr[j].equals("0")) {
                        continue;
                    }
                    if (year[i].indexOf(targetNum) != -1) {
                        contains = true;
                        break;
                    }
                }
                if (!contains) {
                    result++;
                }
            }

            sb.append(result).append("\n");
        }

        br.close();
        bw.write(sb.toString());
        bw.flush();
        bw.close();
    }
}
