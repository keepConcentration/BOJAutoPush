import java.io.*;

class Main {

    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String read = br.readLine();
        while (!read.equals("999")) {
            double temp1 = Double.parseDouble(read);
            read = br.readLine();
            if (read.equals("999")) {
                break;
            }
            double temp2 = Double.parseDouble(read);
            sb.append(String.format("%.2f", temp2 - temp1)).append("\n");
        }

        br.close();
        bw.write(sb.toString());
        bw.flush();
        bw.close();
    }
}