import java.io.*;

class Main {
    
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();
        int count = 0;
        String readLine ;
        while ((readLine = br.readLine()) != null) {
            count++;
        }

        br.close();
        sb.append(count);
        bw.write(sb.toString());
        bw.flush();
        bw.close();
    }
}