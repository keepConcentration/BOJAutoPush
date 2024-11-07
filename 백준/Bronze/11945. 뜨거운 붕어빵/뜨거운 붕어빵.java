import java.io.*;

class Main {
    
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();
        String[] arr = br.readLine().split(" ");
        int N = Integer.parseInt(arr[0]);
        int M = Integer.parseInt(arr[1]);
        StringBuilder in = new StringBuilder();
        while (N-- > 0) {
            in.append(br.readLine());
            sb.append(in.reverse()).append("\n");
            in.delete(0, M);
        }

        bw.write(sb.toString());
        bw.flush();
        bw.close();
    }
}