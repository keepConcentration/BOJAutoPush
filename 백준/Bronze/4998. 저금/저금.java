import java.io.*;

class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();

        String readLine;
        while (true) {
            readLine = br.readLine();
            if ("".equals(readLine) || readLine == null) {
                break;
            }
            String[] arr = readLine.split(" ");
            double N = Double.parseDouble(arr[0]);
            double M = Double.parseDouble(arr[1]);
            double B = Double.parseDouble(arr[2]);

            int year = 0;
            while (N < B) {
                N += N / 100 * M;
                year++;
            }

            sb.append(year).append("\n");
        }
        br.close();
        bw.write(sb.toString());
        bw.flush();
        bw.close();
    }
}