import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

interface Main {
    static void main(String[] b) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int in;
        StringBuilder sb = new StringBuilder();
        l:while ((in = Integer.parseInt(br.readLine())) != -1) {
            int sum = 0;
            StringBuilder resultStr = new StringBuilder();
            resultStr.append(in).append(" = ");
            for (int i = 1; i <= in / 2; ++i) {
                if (in % i == 0) {
                    sum += i;
                    resultStr.append(i).append(" + ");
                }
                if (sum > in) {
                    sb.append(in).append(" is NOT perfect.\n");
                    continue l;
                }
            }
            if (sum != in) {
                sb.append(in).append(" is NOT perfect.\n");
            } else {
                sb.append(resultStr.delete(resultStr.length() - 3, resultStr.length())).append("\n");
            }
        }

        br.close();
        bw.write(sb.toString());
        bw.flush();
        bw.close();
    }
}