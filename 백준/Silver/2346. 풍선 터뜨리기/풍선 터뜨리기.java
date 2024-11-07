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
        String[] arr = br.readLine().split(" ");

        Deque<Balloon> deque = new ArrayDeque<>();

        for (int i = 1; i <= N; ++i) {
            Balloon balloon = new Balloon();
            balloon.index = i;
            balloon.memo = Integer.parseInt(arr[i - 1]);
            deque.addLast(balloon);
        }

        while (!deque.isEmpty()) {
            Balloon balloon = deque.pollFirst();
            sb.append(balloon.index).append(" ");
            if (deque.isEmpty()) {
                break;
            }
            if (balloon.memo < 0) {
                for (int j = 0; j > balloon.memo; --j) {
                    Balloon tempBalloon = deque.pollLast();
                    deque.addFirst(tempBalloon);
                }
            } else {
                for (int j = 0; j < balloon.memo - 1; ++j) {
                    Balloon tempBalloon = deque.pollFirst();
                    deque.addLast(tempBalloon);
                }
            }
        }

        bw.write(sb.toString().trim());
        bw.flush();
        bw.close();
    }

    static class Balloon {
        int index;
        int memo;

        public boolean equals(Balloon balloon) {
            return index == balloon.index;
        }
    }
}