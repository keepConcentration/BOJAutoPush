import java.io.*;

import static java.lang.Double.parseDouble;
import static java.lang.Integer.parseInt;

public class Main {

    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = parseInt(br.readLine());

        while (N-- > 0) {
            String[] strArr = br.readLine().split(" ");
            double n1x = parseDouble(strArr[0]);
            double n1y = parseDouble(strArr[1]);
            double n2x = parseDouble(strArr[2]);
            double n2y = parseDouble(strArr[3]);
            double n3x = parseDouble(strArr[4]);
            double n3y = parseDouble(strArr[5]);

            double m1x = parseDouble(strArr[6]);
            double m1y = parseDouble(strArr[7]);
            double m2x = parseDouble(strArr[8]);
            double m2y = parseDouble(strArr[9]);
            double m3x = parseDouble(strArr[10]);
            double m3y = parseDouble(strArr[11]);

            double nd1 = Math.sqrt(n1x * n1x + n1y * n1y);
            double nd2 = Math.sqrt(n2x * n2x + n2y * n2y);
            double nd3 = Math.sqrt(n3x * n3x + n3y * n3y);

            double md1 = Math.sqrt(m1x * m1x + m1y * m1y);
            double md2 = Math.sqrt(m2x * m2x + m2y * m2y);
            double md3 = Math.sqrt(m3x * m3x + m3y * m3y);

            int nScore = getScore(nd1) + getScore(nd2) + getScore(nd3);
            int mScore = getScore(md1) + getScore(md2) + getScore(md3);

            sb.append("SCORE: ").append(nScore).append(" to ").append(mScore).append(", ")
                    .append(nScore == mScore ? "TIE.\n" : nScore > mScore ? "PLAYER 1 WINS.\n" : "PLAYER 2 WINS.\n");
        }

        br.close();
        bw.write(sb.toString());
        bw.flush();
        bw.close();
    }

    private static int getScore(double d) {
        if (d <= 3.0) {
            return 100;
        }
        if (d <= 6.0) {
            return 80;
        }
        if (d <= 9.0) {
            return 60;
        }
        if (d <= 12.0) {
            return 40;
        }
        if (d <= 15.0) {
            return 20;
        }
        return 0;
    }
}
