import java.io.*;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();

        StringBuilder tempSb = new StringBuilder();

        int L = Integer.parseInt(br.readLine());
        String S = br.readLine();

        char[] charArray = S.toCharArray();
        Arrays.sort(charArray);
        tempSb.append(String.valueOf(charArray));

        if (tempSb.indexOf("A") == -1 ||
            tempSb.indexOf("C") == -1 ||
            tempSb.indexOf("G") == -1 ||
            tempSb.indexOf("T") == -1) {
            sb.append("0");
        } else {
            long a = tempSb.lastIndexOf("A") - tempSb.indexOf("A") + 1;
            long c = tempSb.lastIndexOf("C") - tempSb.indexOf("C") + 1;
            long g = tempSb.lastIndexOf("G") - tempSb.indexOf("G") + 1;
            long t = tempSb.lastIndexOf("T") - tempSb.indexOf("T") + 1;

            long mul = a % 1_000_000_007;
            mul = (mul * c) % 1_000_000_007;
            mul = (mul * g) % 1_000_000_007;
            mul = (mul * t) % 1_000_000_007;

            sb.append(mul);

        }
        bw.write(sb.toString());
        bw.flush();
        bw.close();
    }
}
