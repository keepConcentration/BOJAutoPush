import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();
        String[] arr = br.readLine().split(" ");
        br.close();

        int[] abcdef = new int[6];

        for (int i = 0; i < 6; ++i) {
            abcdef[i] = Integer.parseInt(arr[i]);
        }

        int x = 0, y = 0;
        l: for (int i = -999; i < 1000; ++i) {
            for (int j = -999; j < 1000; ++j) {
                if (abcdef[0] * i + abcdef[1] * j == abcdef[2] &&
                    abcdef[3] * i + abcdef[4] * j == abcdef[5]) {
                    x = i;
                    y = j;
                    break l;
                }
            }
        }

        sb.append(x).append(" ").append(y);
        bw.write(sb.toString());
        bw.flush();
        bw.close();

    }
}
