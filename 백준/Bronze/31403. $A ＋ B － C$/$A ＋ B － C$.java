import java.io.*;

class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String A = br.readLine();
        String B = br.readLine();
        String C = br.readLine();
        br.close();
        String result1 = String.valueOf(Integer.parseInt(A) + Integer.parseInt(B) - Integer.parseInt(C));
        String result2 = String.valueOf(Integer.parseInt(A + B) - Integer.parseInt(C));
        
        bw.write(result1 + "\n" + result2);
        bw.flush();
        bw.close();
    }
}