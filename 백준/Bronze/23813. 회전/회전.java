import java.io.*;

class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();

        String N = br.readLine();
        br.close();
        long result = 0L;
        String circle = N;
        do {
            circle = circle.substring(circle.length() - 1) + circle.substring(0, circle.length() - 1);
            result += Long.parseLong(circle);
        } while (!N.equals(circle));
        sb.append(result);
        bw.write(sb.toString());
        bw.flush();
        bw.close();
    }
}