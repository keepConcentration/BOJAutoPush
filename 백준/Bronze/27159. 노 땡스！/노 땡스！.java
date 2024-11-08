import java.io.*;

class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();
        int N = Integer.parseInt(br.readLine());
        String[] arr = br.readLine().split(" ");
        br.close();
        
        int[] x = new int[N];
        for (int i = 0; i < N; ++i) {
            x[i] = Integer.parseInt(arr[i]);
        }

        int result = 0;
        for (int i = 0; i < N; ++i) {
            if (i == 0) {
                result += x[i];
                continue;
            }
            if (x[i - 1] + 1 == x[i]) {
                continue;
            }
            result += x[i];
        }


        sb.append(result);
        bw.write(sb.toString());
        bw.flush();
        bw.close();
    }
}