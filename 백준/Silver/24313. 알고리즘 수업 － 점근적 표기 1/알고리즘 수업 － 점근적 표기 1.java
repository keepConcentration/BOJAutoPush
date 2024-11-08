import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();
        String[] arr = br.readLine().split(" ");
        int a1 = Integer.parseInt(arr[0]);
        int a0 = Integer.parseInt(arr[1]);
        int c = Integer.parseInt(br.readLine());
        int n = Integer.parseInt(br.readLine());

        if (a1 * n + a0 <= c * n && c >= a1) {
            sb.append(1);
        } else {
            sb.append(0);
        }
        bw.write(sb.toString());
        bw.flush();
        bw.close();

    }
}
