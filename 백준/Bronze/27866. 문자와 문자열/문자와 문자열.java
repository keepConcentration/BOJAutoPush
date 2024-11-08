import java.io.*;

class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String str = br.readLine();
        int at = Integer.parseInt(br.readLine());
        br.close();
        bw.write(str.charAt(at - 1));
        bw.flush();
        bw.close();
    }
}