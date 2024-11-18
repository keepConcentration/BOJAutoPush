import java.io.*;
import java.util.HashMap;

import static java.lang.Integer.parseInt;

public class Main {

    static StringBuilder sb = new StringBuilder();
    static int N;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        N = parseInt(br.readLine());

        int maxCount = 0;
        String maxKey = "";
        HashMap<String, Integer> map = new HashMap<>();
        for (int i = 0; i < N; ++i) {
            String key = br.readLine();
            map.put(key, map.getOrDefault(key, 0) + 1);
            if (maxCount < map.get(key)) {
                maxCount = map.get(key);
                maxKey = key;
            }
            if (maxCount == map.get(key)) {
                maxKey = maxKey.compareTo(key) < 1 ? maxKey : key;
            }
        }
        sb.append(maxKey);

        bw.write(sb.toString());
        bw.flush();
        bw.close();
        br.close();
    }
}
