import java.io.*;

class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();

        String[] arr = br.readLine().split(" ");
        br.close();

        long a = Math.abs(Long.parseLong(arr[0]));
        long b = Math.abs(Long.parseLong(arr[1]));
        long c = Long.parseLong(arr[2]);

        if ((a + b) > c || ((a + b) % 2) != (c % 2)) {
            sb.append("NO\n");
        } else {
            sb.append("YES\n");
        }
        bw.write(sb.toString());
        bw.flush();
        bw.close();
    }
}