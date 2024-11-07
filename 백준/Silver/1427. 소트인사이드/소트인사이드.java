import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();
        String param = br.readLine();
        
        Integer[] arr = new Integer[10];
        
        for (int i = 0; i < param.length(); ++i) {
            String num = param.substring(i, i + 1);
            if (arr[Integer.parseInt(num)] == null) {
                arr[Integer.parseInt(num)] = 1;
            } else {
                arr[Integer.parseInt(num)] += 1;
            }
        }
        
        for (int i = arr.length - 1; i >= 0; --i) {
            while (arr[i] != null && arr[i] != 0) {
                sb.append(String.valueOf(i));
                arr[i] -= 1;
            }
        }
        
        bw.write(sb.toString());
        bw.flush();
        bw.close();
        br.close();
    }
}