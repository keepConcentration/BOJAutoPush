import java.io.*;

class Main{
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int count = Integer.parseInt(br.readLine());
        int result = 1;
        for (int i = 0; i < count; ++i) {
            result += Integer.parseInt(br.readLine());
            result--;
        }
        bw.write(String.valueOf(result));
        bw.flush();
        bw.close();
    }
}