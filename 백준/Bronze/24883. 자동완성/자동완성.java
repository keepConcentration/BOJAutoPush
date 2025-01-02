import java.io.*;

class Main{
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String str = br.readLine();
        if ("N".equalsIgnoreCase(str)) {
            bw.write("Naver D2\n");
        } else {
            bw.write("Naver Whale\n");
        }
        br.close();
        bw.flush();
        bw.close();
    }
}