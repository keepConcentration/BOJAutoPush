import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String param = br.readLine();
        br.close();
        String[] arr = param.split(" ");
        int result = 0;
        for (int i = 0; i < arr.length; ++i) {
            if (Integer.parseInt(arr[i]) > 0) {
                result++;
            }
        }
        bw.write(String.valueOf(result));
        bw.flush();
        bw.close();
    }
}