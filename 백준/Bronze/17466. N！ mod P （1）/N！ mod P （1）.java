import java.io.*;

class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();
        String[] arr = br.readLine().split(" ");
        long N = Long.parseLong(arr[0]);
        long P = Long.parseLong(arr[1]);

        long result = 1;
        if (N == 1) {
            result = 1;
        } else {
            for (int i = 2; i <= N; ++i) {
                result = (result % P) * (i % P) % P;
            }
        }

        sb.append(result);
        bw.write(sb.toString());
        bw.flush();
        bw.close();
    }
}