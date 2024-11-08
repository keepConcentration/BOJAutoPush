import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();
        String[] in = br.readLine().split(" ");

        int N = Integer.parseInt(in[0]);
        int M = Integer.parseInt(in[1]);

        boolean[] rights = new boolean[N];

        in = br.readLine().split(" ");

        for (int i = 0; i < N; ++i) {
            rights[i] = Integer.parseInt(in[i]) == 1;
        }

        while (M-- > 0) {
            in = br.readLine().split(" ");
            int order = Integer.parseInt(in[0]);

            if (order == 1) {
                boolean onOff = Integer.parseInt(in[2]) == 1;
                rights[Integer.parseInt(in[1]) - 1] = onOff;
            } else if (order == 2) {
                int l = Integer.parseInt(in[1]);
                int r = Integer.parseInt(in[2]);

                for (int i = l - 1; i < r; ++i) {
                    rights[i] = !rights[i];
                }
            } else if (order == 3) {
                int l = Integer.parseInt(in[1]);
                int r = Integer.parseInt(in[2]);

                for (int i = l - 1; i < r; ++i) {
                    rights[i] = false;
                }
            } else if (order == 4) {
                int l = Integer.parseInt(in[1]);
                int r = Integer.parseInt(in[2]);

                for (int i = l - 1; i < r; ++i) {
                    rights[i] = true;
                }
            }
        }

        for (int i = 0; i < N; ++i) {
            sb.append(rights[i] ? 1 : 0).append(" ");
        }

        bw.write(sb.toString());
        bw.flush();
        bw.close();
    }
}