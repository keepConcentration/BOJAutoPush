import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

interface Main {
    static void main(String[] b) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        boolean[][] arr = new boolean[101][101];

        int N = Integer.parseInt(br.readLine());

        int result = 0;
        for (int i = 0; i < N; ++i) {
            String[] in = br.readLine().split(" ");
            int hor = Integer.parseInt(in[0]);
            int ver = Integer.parseInt(in[1]);

            for (int j = hor; j < hor + 10; ++j) {
                for (int k = ver; k < ver + 10; ++k) {
                    if (!arr[j][k]) {
                        arr[j][k] = true;
                        result++;
                    }
                }
            }
        }
        br.close();

        bw.write(String.valueOf(result));
        bw.flush();
        bw.close();
    }
}