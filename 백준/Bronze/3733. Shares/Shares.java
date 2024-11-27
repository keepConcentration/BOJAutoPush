import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();
        
        String str;
        while ((str = br.readLine()) != null) {
            String[] strArr = str.split(" ");
            int a = Integer.parseInt(strArr[0]) + 1;
            int b = Integer.parseInt(strArr[1]);
            sb.append(b / a).append("\n");
        }
        bw.write(sb.toString());
        bw.flush();
        bw.close();
        br.close();
        
    }
}