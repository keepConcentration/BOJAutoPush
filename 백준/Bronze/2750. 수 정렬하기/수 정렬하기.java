import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;

interface Main {
    static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();
        
        int loop = Integer.parseInt(br.readLine());
        int[] arr = new int[loop];
        
        for (int i = 0; i < loop; ++i) {
            arr[i] = Integer.parseInt(br.readLine());
        }
        
        for (int i = 0; i < loop - 1; ++i) {
            for (int j = i + 1; j < loop; ++j) {
                if (arr[i] > arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        for (int i = 0; i < loop; ++i) {
            sb.append(String.valueOf(arr[i]));
            sb.append("\n");
        }
        
        bw.write(sb.toString());
        bw.flush();
        bw.close();
    }
}