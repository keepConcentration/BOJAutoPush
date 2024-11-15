import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

interface Main {
    static void main(String[] b) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] in = br.readLine().split(" ");
        br.close();
        
        int N = Integer.parseInt(in[0]);
        int k = Integer.parseInt(in[1]);

        StringBuilder sb = new StringBuilder();

        int count = 0;
        int result = 0;
        for (int i = 1; i <= N && count <= k; ++i) {
            if (N % i == 0) {
                count++;
                if (k == count) {
                    result = i;
                    break;
                }
            }
        }
        sb.append(result);
        bw.write(sb.toString());
        bw.flush();
        bw.close();
    }
}