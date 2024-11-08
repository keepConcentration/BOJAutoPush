import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;
import java.util.Arrays;

interface Main {
    static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuffer sb = new StringBuffer();
        String[] in1 = br.readLine().split(" ");
        String[] in2 = br.readLine().split(" ");
        
        int N = Integer.parseInt(in1[0]);
        int K = Integer.parseInt(in1[1]);
        
        int[] arr = new int[N];
        for (int i = 0; i < N; ++i) {
            arr[i] = Integer.parseInt(in2[i]);
        }
        
        Arrays.sort(arr);
        
        sb.append(arr[N - K]).append("\n");
        
        
        bw.write(sb.toString());
        bw.flush();
        bw.close();
        br.close();
    }
}