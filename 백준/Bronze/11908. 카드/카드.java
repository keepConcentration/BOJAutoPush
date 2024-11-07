import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();
        String in;

        int N = Integer.parseInt(br.readLine());

        int[] arr = new int[N];
        String[] inArr = br.readLine().split(" ");

        int maxIndex = 0;

        for (int i = 0; i < N; ++i) {
            arr[i] = Integer.parseInt(inArr[i]);
            if (arr[maxIndex] < arr[i]) {
                maxIndex = i;
            }
        }
        int result = 0;
        for (int i = 0; i < N; ++i) {
            if (maxIndex != i) {
                result += arr[i];
            }
        }
        sb.append(result);

        bw.write(sb.toString());
        bw.flush();
        bw.close();
    }
}