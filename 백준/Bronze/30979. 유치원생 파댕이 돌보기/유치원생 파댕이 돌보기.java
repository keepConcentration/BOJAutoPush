import java.io.*;

class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();
        int T = Integer.parseInt(br.readLine());
        int N = Integer.parseInt(br.readLine());
        String[] arr = br.readLine().split(" ");

        for (int i = 0; i < arr.length; ++i) {
            T -= Integer.parseInt(arr[i]);
            if (T < 1) {
                sb.append("Padaeng_i Happy");
                break;
            }
        }
        if (T > 0) {
            sb.append("Padaeng_i Cry");
        }

        bw.write(sb.toString());
        bw.flush();
        bw.close();
    }
}