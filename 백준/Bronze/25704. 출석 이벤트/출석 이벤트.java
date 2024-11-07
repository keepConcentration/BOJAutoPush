import java.io.*;

import static java.lang.Integer.parseInt;

public class Main {
    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = parseInt(br.readLine());
        final int P = Integer.parseInt(br.readLine());

        boolean has500DiscountCoupon = N >= 5;
        boolean has10PercentDiscountCoupon = N >= 10;
        boolean has2000DiscountCoupon = N >= 15;
        boolean has25PercentDiscountCoupon = N >= 20;

        int result = P;
        if (has500DiscountCoupon) {
            result = Math.min(result, Math.max(P - 500, 0));
        }
        if (has10PercentDiscountCoupon) {
            result = Math.min(result, P / 10 * 9);
        }
        if (has2000DiscountCoupon) {
            result = Math.min(result, Math.max(P - 2000, 0));
        }
        if (has25PercentDiscountCoupon) {
            result = Math.min(result, P / 4 * 3);
        }
        sb.append(result);

        br.close();
        bw.write(sb.toString());
        bw.flush();
        bw.close();
    }
}
