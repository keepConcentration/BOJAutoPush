import java.io.*;

class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();

        String[] arr = br.readLine().split(" ");
        int a = Integer.parseInt(arr[0]);
        int b = Integer.parseInt(arr[1]);
        int c = Integer.parseInt(arr[2]);
        int d = Integer.parseInt(arr[3]);

        boolean[] boolArr = new boolean[10001];

        int min = min(a, b, c, d);

        a = min / 1000;
        b = (min - min / 1000 * 1000) / 100;
        c = (min - min / 100 * 100) / 10;
        d = min % 10;

        l:for (int i = 1; i <= 9; ++i) {
            for (int j = 1; j <= 9; ++j) {
                for (int k = 1; k <= 9; ++k) {
                    for (int m = 1; m <= 9; ++m) {
                        int min1 = min(i, j, k, m);
                        if (min1 <= min) {
                            boolArr[min1] = true;
                        } else {
                            break l;
                        }
                    }
                }
            }
        }

        int count = 0;
        for (int i = 1111; i <= min; ++i) {
            if (boolArr[i]) {
                count++;
            }
        }
        sb.append(count);

        br.close();
        bw.write(sb.toString());
        bw.flush();
        bw.close();
    }

    private static int min(int a, int b, int c, int d) {
        return Math.min(Math.min(a*1000 + b*100 + c*10 + d, b*1000 + c*100 + d*10 + a),
                Math.min(c*1000 + d*100 + a*10 + b, d*1000 + a*100 + b*10 + c));
    }
}