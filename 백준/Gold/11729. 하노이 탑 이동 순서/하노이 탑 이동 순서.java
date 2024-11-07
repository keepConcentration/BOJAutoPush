import java.io.*;

class Main {
    static StringBuilder sb = new StringBuilder();

    static int N;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        N = Integer.parseInt(br.readLine());
        sb.append((int)(Math.pow(2, N)) - 1).append("\n");
        recursion(N, 1, 2, 3);

        br.close();
        bw.write(sb.toString());
        bw.flush();
        bw.close();
    }

    private static void recursion(int n, int start, int mid, int end) {
        if (n == 1) {
            sb.append(start).append(" ").append(end).append("\n");
            return;
        }

        recursion(n - 1, start, end, mid);
        sb.append(start).append(" ").append(end).append("\n");
        recursion(n - 1, mid, start, end);
    }
}