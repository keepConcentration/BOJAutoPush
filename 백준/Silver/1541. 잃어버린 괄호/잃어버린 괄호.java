import java.io.*;

import static java.lang.Integer.parseInt;

public class Main {

    static final StringBuilder sb = new StringBuilder();
    static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static final BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String[] args) throws IOException {
        String in = br.readLine();
        int result = 0;

        int minusIndex = in.indexOf('-');
        if (minusIndex == -1) {
            String[] strArr = in.split("\\+");
            for (int i = 0; i < strArr.length; ++i) {
                result += parseInt(strArr[i]);
            }
        } else {
            String str = in.substring(0, minusIndex);
            String[] strArr = str.split("\\+");
            for (int i = 0; i < strArr.length; ++i) {
                result += parseInt(strArr[i]);
            }
            str = in.substring(minusIndex + 1);
            strArr = str.split("\\+|-");
            for (int i = 0; i < strArr.length; ++i) {
                result -= parseInt(strArr[i]);
            }
        }
        sb.append(result).append("\n");

        bw.write(sb.toString());
        bw.flush();
        bw.close();
        br.close();
    }
}
