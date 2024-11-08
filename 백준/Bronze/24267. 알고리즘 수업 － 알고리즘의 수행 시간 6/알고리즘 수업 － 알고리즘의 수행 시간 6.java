import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

class Main {
    static Long[] sumArr = new Long[500001];
    static Long[] arr = new Long[500001];

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();

        sumArr[0] = 0L;
        sumArr[1] = 1L;

        arr[0] = arr[1] = arr[2] = 0L;
        arr[3] = 1L;
        arr[4] = 4L;
        arr[5] = 10L;
        arr[6] = 20L;
        arr[7] = 35L;


        long N = Long.parseLong(br.readLine());
        br.close();
        for (int i = 2; i <= N; ++i) {
            sumArr[i] = sumArr[i - 1] + i;
        }

        for (int i = 4; i <= N; ++i) {
            arr[i] = arr[i - 1] + sumArr[i - 2];
        }
        
        sb.append(arr[(int)N]).append("\n3");
        bw.write(sb.toString());
        bw.flush();
        bw.close();
    }
}