import java.io.*;

class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String in = br.readLine();
        if ("NLCS".equals(in)) {
            bw.write("North London Collegiate School\n");
        } else if ("BHA".equals(in)) {
            bw.write("Branksome Hall Asia\n");
        } else if ("KIS".equals(in)) {
            bw.write("Korea International School\n");
        } else {
            bw.write("St. Johnsbury Academy\n");
        }
        br.close();
        bw.flush();
        bw.close();
     }
}