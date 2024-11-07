import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(br.readLine());
        int[] trees = new int[N];
        int minTree = Integer.parseInt(br.readLine());
        int gcd = 0;
        for (int i = 1; i < N; ++i) {
            trees[i] = Integer.parseInt(br.readLine()) - minTree;
            if (i == 1) {
                gcd = trees[i];
            } else {
                gcd = gcd(gcd, trees[i]);
            }
        }
        sb.append(trees[N - 1] / gcd - trees.length + 1);
        bw.write(sb.toString());
        bw.flush();
        bw.close();
    }

    private static int gcd(int a, int b) {
        if (a % b == 0) {
            return b;
        }
        return gcd(b, a % b);
    }
}
