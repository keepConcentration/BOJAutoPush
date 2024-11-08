import java.io.*;

class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();

        boolean[] prime = new boolean[7_368_788];
        prime[0] = prime[1] = false;

        int k = Integer.parseInt(br.readLine());
        int count = 0;
        for (int i = 2; i <= 7_368_787; ++i) {
            if (!prime[i]) {
                count++;
                if (count == k) {
                    sb.append(i).append("\n");
                    break;
                }
                for (int j = i + i; j <= 7_368_787; j += i) {
                    prime[j] = true;
                }
            }
        }

        bw.write(sb.toString());
        bw.flush();
        bw.close();
    }
}