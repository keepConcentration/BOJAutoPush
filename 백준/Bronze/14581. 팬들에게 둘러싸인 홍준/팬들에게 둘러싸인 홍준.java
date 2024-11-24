import java.io.*;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();
        String in = br.readLine();
        sb.append(":fan::fan::fan:\n:fan::");
        sb.append(in);
        sb.append("::fan:\n:fan::fan::fan:\n");
        bw.write(sb.toString());
        bw.flush();
        bw.close();
        br.close();
        
    }
}