import java.io.*;

class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();
        String[] arr = br.readLine().split("-");

        for (int i = 0; i < arr.length; ++i) {
            sb.append(arr[i].charAt(0));
        }

        br.close();
        bw.write(sb.toString());
        bw.flush();
        bw.close();
    }
}