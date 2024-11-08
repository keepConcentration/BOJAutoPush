import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

class Main {
    
    static Long[] arr = new Long[500001];

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        long in = Long.parseLong(br.readLine());
        arr[0] = arr[1] = 0L;
        arr[2] = 1L;
        arr[3] = 3L;
        for (int i = 4; i <= in; ++i) {
            arr[i] = arr[i - 1] + i - 1;
        }
        System.out.print(arr[(int)in] + "\n2");
    }
}