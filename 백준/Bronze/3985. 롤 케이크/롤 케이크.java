import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(br.readLine());
        int maxNumber = 0;
        int actualMaxNumber = 0;

        int maxCount = 0;
        int actualMaxCount = 0;

        Integer[] arr = new Integer[N + 1];
        int count = Integer.parseInt(br.readLine());
        int[] person = new int[count + 1];

        for (int i = 1; i <= count; ++i) {
            String[] in = br.readLine().split(" ");
            int min = Integer.parseInt(in[0]);
            int max = Integer.parseInt(in[1]);
            int actual = 0;
            for (int j = min; j <= max; ++j) {
                if (arr[j] == null) {
                    arr[j] = i;
                    person[i]++;
                }
            }
            if (maxCount < max - min) {
                maxCount = max - min;
                maxNumber = i;
            }
            if (actualMaxCount < person[i]) {
                actualMaxCount = person[i];
                actualMaxNumber = i;
            }
        }
        br.close();

        sb.append(maxNumber).append("\n").append(actualMaxNumber);

        bw.write(sb.toString());
        bw.flush();
        bw.close();
    }
}
