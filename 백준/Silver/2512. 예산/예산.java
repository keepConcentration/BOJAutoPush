import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;
import java.util.Arrays;
import static java.lang.Integer.parseInt;

interface Main {
    static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuffer sb = new StringBuffer();
        
        int N = parseInt(br.readLine());
        int M = 0;
        int max = -1;
        int min = 0;
        String[] in = br.readLine().split(" ");
        M = parseInt(br.readLine());
        int[] arr = new int[N];
        
        for (int i = 0; i < N; ++i) {
            arr[i] = parseInt(in[i]);
            if (max < arr[i]) {
                max = arr[i];
            }
        }
        
        int mid2 = 0;
        while (min <= max) {
            mid2 = (min + max) / 2;
            long sum = 0;
            for (int i = 0; i < N; ++i) {
                if (mid2 < arr[i]) {
                    sum += mid2;
                } else {
                    sum += arr[i];
                }
            }
            
            if (M < sum) {
                max = mid2- 1;
            } else {
                min = mid2 + 1;
            }
        }
        
        
        
        sb.append(max).append("\n");
        bw.write(sb.toString());
        bw.flush();
        bw.close();
        br.close();
    }
}