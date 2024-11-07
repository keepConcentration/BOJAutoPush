import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;
import java.util.StringTokenizer;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int loop = Integer.parseInt(br.readLine()),
            result = loop;
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < loop; ++i) {
            int target = Integer.parseInt(st.nextToken());
            if (target == 1) {
                --result;
                continue;
            } else if (target == 2) continue;
            for (int j = target - 1; j > 1; --j) {
                if (target % j == 0) {
                    --result;
                    break;
                }
            }
        }
        bw.write(String.valueOf(result));
        bw.flush();
    }
}