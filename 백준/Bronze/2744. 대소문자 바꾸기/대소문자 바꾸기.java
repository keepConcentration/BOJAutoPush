import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.BufferedWriter;
import java.io.OutputStreamWriter;
import java.io.IOException;
import static java.lang.Character.*;

interface Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        char[] in = br.readLine().toCharArray();
        char[] result = new char[in.length];
        
        for (int i = 0; i < in.length; ++i) {
            if (isUpperCase(in[i])) {
                result[i] = toLowerCase(in[i]);
            } else {
                result[i] = toUpperCase(in[i]);
            }
        }
        
        bw.write(result);
        bw.close();
        br.close();
    }
}