import java.io.*;
import java.math.BigDecimal;

import static java.lang.Double.parseDouble;

public class Main {

    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        double[] arr = new double[10];
        double min = 2;
        int minIndex = -1;
        for (int i = 0; i < 10; ++i) {
            arr[i] = parseDouble(br.readLine());
            if (arr[i] < min) {
                min = arr[i];
                minIndex = i;
            }
        }

        double result = 1;
        for (int i = 0; i < 10; ++i) {
            if (i != minIndex) {
                result = result * arr[i] * 10;
            }
        }
        for (int i = 2; i <= 9; ++i) {
            result = result / i;
        }

        sb.append(new BigDecimal(result).toPlainString());
        if (sb.indexOf(".") != -1) {
            for (int i = sb.length() - 1; i >= 0; --i) {
                char cha = sb.charAt(i);
                if (cha == '0') {
                    sb.deleteCharAt(i);
                } else if (cha != '.') {
                    break;
                } else {
                    sb.deleteCharAt(i);
                    break;
                }
            }
        }

        br.close();
        bw.write(sb.toString());
        bw.flush();
        bw.close();
    }
}
