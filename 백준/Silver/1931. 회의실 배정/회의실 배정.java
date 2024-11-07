import java.io.*;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import static java.lang.Integer.parseInt;

class Main {

    static StringBuilder sb = new StringBuilder();

    static List<int[]> list;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = parseInt(br.readLine());
        list = new ArrayList<>();

        int minStartTime = Integer.MAX_VALUE;
        int maxEndTime = Integer.MIN_VALUE;

        for (int i = 0; i < N; ++i) {
            String[] strArr = br.readLine().split(" ");
            int startTime = parseInt(strArr[0]);
            int endTime = parseInt(strArr[1]);
            minStartTime = Math.min(minStartTime, startTime);
            maxEndTime = Math.max(maxEndTime, endTime);
            list.add(new int[] {startTime, endTime});

        }
        Collections.sort(list, (o1, o2) -> {
            if (o1[1] < o2[1]) {
                return -1;
            }
            if (o1[1] > o2[1]) {
                return 1;
            }
            if (o1[0] < o2[0]) {
                return -1;
            }
            if (o1[0] > o2[0]) {
                return 1;
            }
            return 0;
        });

        int lastTime = 0;
        int result = 0;
        for (int i = 0; i < list.size(); ++i) {
            int[] arr = list.get(i);
            if (arr[0] >= lastTime) {
                lastTime = arr[1];
                result++;
            }
        }
        sb.append(result);
        br.close();
        bw.write(sb.toString());
        bw.flush();
        bw.close();
    }
}