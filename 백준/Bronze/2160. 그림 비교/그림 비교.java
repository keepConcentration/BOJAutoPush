import java.io.*;

import static java.lang.Integer.parseInt;

public class Main {

    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = parseInt(br.readLine());
        char[][][] artworks = new char[N][5][7];

        for (int i = 0; i < N; ++i) {
            for (int j = 0; j < 5; ++j) {
                String str = br.readLine();
                for (int k = 0; k < 7; ++k) {
                    artworks[i][j][k] = str.charAt(k);
                }
            }
        }

        int count = Integer.MAX_VALUE;
        int artwork1 = 1;
        int artwork2 = 2;

        for (int i = 0; i < N - 1; ++i) {
            for (int j = i + 1; j < N; ++j) {
                int curCount = 0;

                l:for (int k = 0; k < 5; ++k) {
                    for (int m = 0; m < 7; ++m) {
                        if (artworks[i][k][m] != artworks[j][k][m]) {
                            curCount++;
                            if (curCount > count) {
                                break l;
                            }
                        }
                    }
                }
                if (curCount < count) {
                    count = curCount;
                    artwork1 = i;
                    artwork2 = j;
                }
            }
        }
        sb.append(artwork1 + 1).append(" ").append(artwork2 + 1).append("\n");

        br.close();
        bw.write(sb.toString());
        bw.flush();
        bw.close();
    }
}
