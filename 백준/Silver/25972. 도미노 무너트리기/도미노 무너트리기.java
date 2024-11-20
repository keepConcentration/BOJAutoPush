import java.io.*;
import java.util.*;

import static java.lang.Integer.parseInt;

public class Main {

    static final StringBuilder sb = new StringBuilder();
    static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static final BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String[] args) throws IOException {

        int N = parseInt(br.readLine());
        Map<Integer, Integer> domino = new HashMap<>();
        for (int i = 0; i < N; ++i) {
            String[] strArr = br.readLine().split(" ");
            domino.put(parseInt(strArr[0]), parseInt(strArr[1]));
        }

        List<Integer> keyList = new ArrayList<>(domino.keySet());
        Collections.sort(keyList);

        int result = 1;
        int lastX = keyList.get(0) + domino.get(keyList.get(0));

        for (int i = 1; i < N; ++i) {
            int a = keyList.get(i);
            int l = domino.get(a);
            if (lastX < a) {
                lastX = a + l;
                result++;
            } else {
                lastX = a + l;
            }
        }

        sb.append(result).append("\n");

        bw.write(sb.toString());
        bw.flush();
        bw.close();
        br.close();
    }
}
