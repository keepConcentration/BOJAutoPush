import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.*;

class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(br.readLine());
        int result = 0;

        HashMap<String, String> map = new HashMap<>();
        for (int i = 0; i < N; ++i) {
            String in = br.readLine();
            if ("ENTER".equals(in)) {
                map.clear();
                continue;
            }
            if (!map.containsKey(in)) {
                map.put(in, "");
                result++;
            }
        }
        sb.append(result);
        bw.write(sb.toString());
        bw.flush();
        bw.close();
    }
}