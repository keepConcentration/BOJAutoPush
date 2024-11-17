import java.io.*;
class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();
        
        if (br.readLine().indexOf(br.readLine()) != -1) {
            sb.append("go");
        } else {
            sb.append("no");
        }
        
        br.close();
        bw.write(sb.toString());
        bw.flush();
        bw.close();
    }
}