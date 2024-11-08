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

        boolean appearedChongChong = false;
        HashMap<String, Boolean> visitedChongChongMap = new HashMap<>();
        for (int i = 0; i < N; ++i) {
            String[] inArr = br.readLine().split(" ");
            String in1 = inArr[0];
            String in2 = inArr[1];
            if (!appearedChongChong && !"ChongChong".equals(in1) && !"ChongChong".equals(in2)) {
                continue;
            }

            if (!appearedChongChong) {
                if ("ChongChong".equals(in1) || "ChongChong".equals(in2)) {
                    appearedChongChong = true;
                    visitedChongChongMap.put(in1, true);
                    visitedChongChongMap.put(in2, true);
                    result += 2;
                }
            } else {
                if (visitedChongChongMap.containsKey(in1) && visitedChongChongMap.containsKey(in2)) {
                    continue;
                }
                if (visitedChongChongMap.containsKey(in1)) {
                    visitedChongChongMap.put(in2, true);
                    result++;
                } else if (visitedChongChongMap.containsKey(in2)) {
                    visitedChongChongMap.put(in1, true);
                    result++;
                }
            }
        }
        sb.append(result);
        bw.write(sb.toString());
        bw.flush();
        bw.close();
    }
}