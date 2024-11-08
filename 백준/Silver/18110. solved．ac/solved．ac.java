import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;

class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int length = Integer.parseInt(br.readLine());
        int[] in = new int[length];
        for (int i = 0; i < in.length; ++i) {
            in[i] = Integer.parseInt(br.readLine());
        }

        int deleteCount = (int)(Math.round(length * 0.15));
        Arrays.sort(in);

        double sum = 0;
        for (int i = deleteCount; i < length - deleteCount; ++i) {
            sum += in[i];
        }

        int avg = (int) Math.round(sum / (length - deleteCount * 2));

        bw.write(String.valueOf(avg));

        bw.flush();
        bw.close();
    }
}