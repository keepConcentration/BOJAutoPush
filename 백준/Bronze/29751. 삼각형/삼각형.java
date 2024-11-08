import java.io.*;

class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();
        String[] arr = br.readLine().split(" ");

        int W = Integer.parseInt(arr[0]);
        int H = Integer.parseInt(arr[1]);

        double result = Math.floor(W * H * 10 / 2) / 10;
        sb.append(String.format("%.1f", result)).append("\n");
        bw.write(sb.toString());
        bw.flush();
        bw.close();
    }
}