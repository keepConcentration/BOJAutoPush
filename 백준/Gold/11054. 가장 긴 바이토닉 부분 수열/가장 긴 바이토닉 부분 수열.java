import java.io.*;

class Main {

    static Integer[] upDp;
    static Integer[] downDp;

    static int[] data;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(br.readLine());
        upDp = new Integer[N + 1];
        downDp = new Integer[N + 1];
        data = new int[N + 1];

        data[0] = Integer.MIN_VALUE;

        String[] arr = br.readLine().split(" ");
        for (int i = 1; i <= N; ++i) {
            data[i] = Integer.parseInt(arr[i - 1]);
        }
        for (int i = 1; i <= N; ++i) {
            upRecursion(i);
        }
        for (int i = N; i > 0; --i) {
            downRecursion(i);
        }

        int max = upDp[1] + downDp[1] - 1;
        for (int i = 2; i <= N; ++i) {
            max = Math.max(max, upDp[i] + downDp[i] - 1);
        }

        sb.append(max).append("\n");
        br.close();
        bw.write(sb.toString());
        bw.flush();
        bw.close();
    }

    private static int downRecursion(int n) {
        if (downDp[n] == null) {
            downDp[n] = 1;
            for (int i = n + 1; i < downDp.length; ++i) {
                if (data[i] < data[n]) {
                    downDp[n] = Math.max(downDp[n], downRecursion(i) + 1);
                }
            }
        }
        return downDp[n];
    }

    private static int upRecursion(int n) {
        if (upDp[n] == null) {
            upDp[n] = 1;
            for (int i = n - 1; i > 0; --i) {
                if (data[n] > data[i]) {
                    upDp[n] = Math.max(upDp[n], upRecursion(i) + 1);
                }
            }
        }
        return upDp[n];
    }
}