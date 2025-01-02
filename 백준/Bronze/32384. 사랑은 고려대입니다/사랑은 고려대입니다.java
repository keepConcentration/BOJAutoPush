import java.io.*;
class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();
        int N = Integer.parseInt(br.readLine());
        while (N-- > 0) {
            sb.append("LoveisKoreaUniversity ");
        }
        sb.append("\n");
        bw.write(sb.toString());
        bw.flush();
        bw.close();
        br.close();
    }
}