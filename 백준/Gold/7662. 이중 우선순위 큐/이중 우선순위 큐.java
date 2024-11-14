import java.io.*;
import java.util.Comparator;
import java.util.HashMap;
import java.util.PriorityQueue;

import static java.lang.Integer.parseInt;

public class Main {

    static StringBuilder sb = new StringBuilder();
    static HashMap<Integer, Integer> map = new HashMap<>();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int T = parseInt(br.readLine());
        while (T-- > 0) {
            int K = parseInt(br.readLine());
            PriorityQueue<Integer> maxQueue = new PriorityQueue<>(Comparator.reverseOrder());
            PriorityQueue<Integer> minQueue = new PriorityQueue<>();
            map = new HashMap<>();

            while (K-- > 0) {
                String str = br.readLine();
                String[] strArr = str.split(" ");
                if (strArr[0].equals("I")) {
                    int offer = parseInt(strArr[1]);
                    maxQueue.offer(offer);
                    minQueue.offer(offer);
                    map.put(offer, map.getOrDefault(offer, 0) + 1);
                    continue;
                }
                if (!map.isEmpty()) {
                    if (str.equals("D 1")) {
                        poll(maxQueue);
                    } else {
                        poll(minQueue);
                    }
                }
            }
            if (map.isEmpty()) {
                sb.append("EMPTY\n");
            } else {
                int max = poll(maxQueue);
                int min = map.isEmpty() ? max : poll(minQueue);
                sb.append(max).append(" ").append(min).append("\n");
            }
        }

        br.close();
        bw.write(sb.toString());
        bw.flush();
        bw.close();
    }

    private static Integer poll(PriorityQueue<Integer> queue) {
        int num;
        while (true) {
            num = queue.poll();
            int count = map.getOrDefault(num, 0);
            if (count == 0) {
                continue;
            }
            if (count == 1) {
                map.remove(num);
                break;
            }
            map.put(num, count - 1);
            break;
        }
        return num;
    }
}
