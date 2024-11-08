import java.io.*;
import java.math.BigInteger;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();
        int N = Integer.parseInt(br.readLine());
        StringBuilder S = new StringBuilder(br.readLine());


        String[] s = S.toString().split("[013456789]");
        BigInteger totalScore = BigInteger.ZERO;
        for (int i = 0; i < s.length; ++i) {
            if (!"".equals(s[i])) {
                totalScore = totalScore.add(getScore(new BigInteger(String.valueOf(s[i].length()))));
            }
        }
        sb.append(totalScore);
        bw.write(sb.toString());
        bw.flush();
        bw.close();
    }

    private static BigInteger getScore(BigInteger count) {
        if (count.compareTo(BigInteger.ONE) == 0) {
            return BigInteger.ONE;
        }
        if (count.compareTo(new BigInteger("2")) == 0) {
            return new BigInteger("4");
        }
        return (count.multiply(count)).add(getScore(count.subtract(new BigInteger("2"))));
    }
}
