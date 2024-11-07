import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;

interface Main {
    static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String param = br.readLine();
        int target = Integer.parseInt(param);
        int result = 0;
        
        for (int i = 0; i < target; ++i) {
            int compute = i;
            String ii = "" + i;
            String[] arr = ii.split("");
            for (int j = 0; j < arr.length; ++j) {
                compute += Integer.parseInt(arr[j]);
            }
            if (compute == target) {
                result = i;
                break;
            }
        }
        bw.write(String.valueOf(result));
        bw.flush();
        bw.close();
        br.close();
    }
}