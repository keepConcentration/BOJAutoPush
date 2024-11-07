import java.io.*;

class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();
        String[] strArr = br.readLine().split(" ");
        int N = Integer.parseInt(strArr[0]);
        int K = Integer.parseInt(strArr[1]);

        int count = 0;
        boolean[] prime = new boolean[N + 1];
        prime[0] = prime[1] = true;
        for (int i = 2; i <= N; ++i) {
            if (prime[i]) {
                continue;
            }

            for (int j = i; j <= N; j += i) {
                if (prime[j]) {
                    continue;
                }
                count++;
                prime[j] = true;
                if (count == K) {
                    sb.append(j);
                    break;
                }
            }
        }

        bw.write(sb.toString());
        bw.flush();
        bw.close();
    }
}