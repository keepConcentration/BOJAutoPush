import java.io.*;

class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();

        boolean[] prime = new boolean[1_000_001];
        prime[0] = prime[1] = true;

        for (int i = 2; i <= 1_000_000; ++i) {
            if (!prime[i]) {
                for (int j = i + i; j <= 1_000_000; j += i) {
                    prime[j] = true;
                }
            }
        }

        String str;
        while (!(str = br.readLine()).equals("0")) {
            int n = Integer.parseInt(str);
            l:for (int i = 2; i <= n / 2; ++i) {
                if (!prime[i] && !prime[n - i]) {
                    sb.append(n).append(" = ").append(i).append(" + ").append(n - i).append("\n");
                    break l;
                }
            }
        }

        bw.write(sb.toString());
        bw.flush();
        bw.close();
    }
}