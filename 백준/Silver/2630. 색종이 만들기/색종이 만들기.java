import java.io.*;

class Main {

    static StringBuilder sb = new StringBuilder();
    static int N;
    static boolean[][] paper;
    static int blueCount = 0;
    static int whiteCount = 0;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        N = Integer.parseInt(br.readLine());

        paper = new boolean[N + 1][N + 1];
        for (int i = 1; i <= N; ++i) {
            String[] strArr = br.readLine().split(" ");
            for (int j = 1; j <= N; ++j) {
                paper[i][j] = "1".equals(strArr[j - 1]);
            }
        }

        recursion(1, 1, N);

        sb.append(whiteCount).append("\n");
        sb.append(blueCount).append("\n");

        br.close();
        bw.write(sb.toString());
        bw.flush();
        bw.close();
    }

    private static void recursion(int x, int y, int size) {
        if (size == 0) {
            return;
        }
        boolean allBlue = true;
        boolean allWhite = true;
        l:for (int i = x; i < x + size; ++i) {
            for (int j = y; j < y + size; ++j) {
                if (!paper[i][j]) {
                    allBlue = false;
                }
                if (paper[i][j]) {
                    allWhite = false;
                }
                if (!allBlue && !allWhite) {
                    break l;
                }
            }
        }
        if (allBlue) {
            blueCount++;
        }
        if (allWhite) {
            whiteCount++;
        }
        if (!allBlue && !allWhite) {
            int halfSize = size / 2;
            recursion(x, y, halfSize);
            recursion(x + halfSize, y, halfSize);
            recursion(x, y + halfSize, halfSize);
            recursion(x + halfSize, y + halfSize, halfSize);
        }
    }
}