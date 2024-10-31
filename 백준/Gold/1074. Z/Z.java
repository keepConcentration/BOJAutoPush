import java.io.*;

class Main {

    static StringBuilder sb = new StringBuilder();

    static int N;

    static Integer[] dp;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] arr = br.readLine().split(" ");
        N = Integer.parseInt(arr[0]);
        int size = (int)Math.pow(2, N);
        int value = (int)Math.pow(4, N);
        int r = Integer.parseInt(arr[1]);
        int c = Integer.parseInt(arr[2]);
        
        int sum = 0;
        while (size != 1) {
            size /= 2; // 4
            value /= 4;

            if (r < size) {
                if (c >= size) {
                    sum += value;
                    c -= size;
                }
                continue;
            }
            if (c >= size) {
                sum += value * 3;
                c -= size;
                r -= size;
                continue;
            }
            sum += value * 2;
            r -= size;
        }

        sb.append(sum);
        br.close();
        bw.write(sb.toString());
        bw.flush();
        bw.close();
    }
}