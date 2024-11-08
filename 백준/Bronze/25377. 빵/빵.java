import java.io.*;

class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();
        int N = Integer.parseInt(br.readLine());

        int time = Integer.MAX_VALUE;

        while (N-- > 0) {
            String[] arr = br.readLine().split(" ");
            int walkTime = Integer.parseInt(arr[0]);
            int mallTime = Integer.parseInt(arr[1]);

            if (walkTime <= mallTime && mallTime < time) {
                time = mallTime;
            }
        }
        br.close();
        if (time == Integer.MAX_VALUE) {
            time = -1;
        }
        bw.write(String.valueOf(time));
        bw.write(sb.toString());
        bw.flush();
        bw.close();
    }
}