import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();

        String[] arr1 = br.readLine().split(" ");
        String[] arr2 = br.readLine().split(" ");

        int a = Integer.parseInt(arr1[0]);
        int b = Integer.parseInt(arr1[1]);
        int c = Integer.parseInt(arr2[0]);
        int d = Integer.parseInt(arr2[1]);

        int sum1 = a * d + b * c;
        int bottom = b * d;

        int gcd = gcd(sum1, bottom);

        sb.append(sum1 / gcd).append(" ").append(bottom / gcd);
        bw.write(sb.toString());
        bw.flush();
        bw.close();
    }

    private static int gcd(int a, int b) {
        if (a % b == 0) {
            return b;
        }
        return gcd(b, a % b);
    }
}
