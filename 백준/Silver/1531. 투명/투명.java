import java.io.*;

class Main {
    static int[][] arr = new int[101][101];

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();

        String[] strArr = br.readLine().split(" ");
        int N = Integer.parseInt(strArr[0]);
        int M = Integer.parseInt(strArr[1]);

        for (int i = 0; i < N; ++i) {
            strArr = br.readLine().split(" ");
            int startX = Integer.parseInt(strArr[0]);
            int startY = Integer.parseInt(strArr[1]);
            int endX = Integer.parseInt(strArr[2]);
            int endY = Integer.parseInt(strArr[3]);

            for (int x = startX; x <= endX; ++x) {
                for (int y = startY; y <= endY; ++y) {
                    arr[x][y]++;
                }
            }
        }

        int result = 0;
        for (int x = 1; x <= 100; ++x) {
            for (int y = 1; y <= 100; ++y) {
                if (arr[x][y] > M) {
                    result++;
                }
            }
        }
        sb.append(result);

        br.close();
        bw.write(sb.toString());
        bw.flush();
        bw.close();
    }
}