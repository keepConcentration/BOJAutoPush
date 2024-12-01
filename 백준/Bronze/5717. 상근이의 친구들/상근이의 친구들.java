import java.io.*;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();
        
        String in;
        while (!(in = br.readLine()).equals("0 0")) {
            String[] strArr = in.split(" ");
            sb.append(Integer.parseInt(strArr[0]) + Integer.parseInt(strArr[1])).append("\n");
        }
        
        br.close();
        bw.write(sb.toString());
        bw.flush();
        bw.close();
    }
}