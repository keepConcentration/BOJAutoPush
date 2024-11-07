import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

class Main {
    public static void main(String[] b) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] arr = br.readLine().split(" ");

        String[] in = arr[0].split("");
        int num = Integer.parseInt(arr[1]);

        long result = 0;
        for (int i = in.length - 1, j = 0; j < in.length; --i, ++j) {
            int numNum = getNum(in[i]);
            result += (long)(Math.pow(num, j)) * numNum;
        }
        br.close();

        bw.write(String.valueOf(result));
        bw.flush();
        bw.close();
    }

    private static int getNum(String a) {
        try {
            return Integer.parseInt(a);
        } catch (NumberFormatException e) {
            char c = a.toCharArray()[0];
            return c - 55;
        }
    }
}