import java.io.*;

import static java.lang.Integer.parseInt;

public class Main {

    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] arr = br.readLine().split(" ");
        int E = parseInt(arr[0]);
        int S = parseInt(arr[1]);
        int M = parseInt(arr[2]);

        int EE = 1;
        int SS = 1;
        int MM = 1;
        int result = 1;
        while (EE != E || SS != S || MM != M) {
            if (EE == 15) {
                EE = 1;
            } else {
                EE++;
            }
            if (SS == 28) {
                SS = 1;
            } else {
                SS++;
            }
            if (MM == 19) {
                MM = 1;
            } else {
                MM++;
            }
            result++;
        }

        sb.append(result);

        br.close();
        bw.write(sb.toString());
        bw.flush();
        bw.close();
    }
}
