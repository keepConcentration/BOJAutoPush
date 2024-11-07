import java.io.*;
import java.util.Arrays;

class Main {

    static StringBuilder sb = new StringBuilder();

    static int N, M;

    static int[] card;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        N = Integer.parseInt(br.readLine());
        card = new int[N];
        String[] arr = br.readLine().split(" ");

        for (int i = 0; i < N; ++i) {
            card[i] = Integer.parseInt(arr[i]);
        }

        Arrays.sort(card);

        M = Integer.parseInt(br.readLine());
        arr = br.readLine().split(" ");
        l:for (int i = 0; i < M; ++i) {
            int targetCard = Integer.parseInt(arr[i]);

            int left = 0;
            int right = N;
            int mid = 0;
            while (left < right) {
                mid = (left + right) / 2;
                if (card[mid] == targetCard) {
                    sb.append("1 ");
                    continue l;
                }
                if (targetCard < card[mid]) {
                    right = mid;
                } else {
                    left = mid + 1;
                }
            }
            sb.append("0 ");
        }

        br.close();
        bw.write(sb.toString());
        bw.flush();
        bw.close();
    }
}