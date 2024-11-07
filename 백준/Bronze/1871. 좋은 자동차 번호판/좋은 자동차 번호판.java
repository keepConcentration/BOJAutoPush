import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();
        int N = Integer.parseInt(br.readLine());

        for (int i = 0; i < N; ++i) {
            String[] in = br.readLine().split("-");
            String eng = in[0];
            int num = Integer.parseInt(in[1]);
            int num2 = 0;
            for (int j = 2, k = 0; j >= 0; --j, ++k) {
                char cha = eng.charAt(j);
                num2 += Math.pow(26, k) * (cha - 65);
            }

            if (Math.abs(num - num2) > 100) {
                sb.append("not nice\n");
            } else {
                sb.append("nice\n");
            }
        }

        bw.write(sb.toString());
        bw.flush();
        bw.close();
    }
}