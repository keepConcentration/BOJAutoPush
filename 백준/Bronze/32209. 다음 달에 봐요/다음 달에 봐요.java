import java.io.*;

class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();
        int Q = Integer.parseInt(br.readLine());
        int x = 0;
        for (int i = 0; i < Q; ++i) {
            String[] arr = br.readLine().split(" ");
            if (arr[0].equals("1")) {
                x += Integer.parseInt(arr[1]);
                continue;
            }
            if (arr[0].equals("2")) {
                x -= Integer.parseInt(arr[1]);
            }
            if (x < 0) {
                sb.append("Adios");
                break;
            }
        }
        if (x >= 0) {
            sb.append("See you next month");
        }

        br.close();
        bw.write(sb.toString());
        bw.flush();
        bw.close();
    }
}