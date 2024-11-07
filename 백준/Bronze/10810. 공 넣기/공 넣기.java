import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.BufferedWriter;
import java.io.OutputStreamWriter;

public class Main {
    public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		String[] params = br.readLine().split(" ");
		
		int N = Integer.parseInt(params[0]);
		int M = Integer.parseInt(params[1]);
        
        int[] bucket = new int[N + 1];
        
        for (int i = 1; i <= M; ++i) {
            params = br.readLine().split(" ");
            int fromBucket = Integer.parseInt(params[0]);
            int toBucket = Integer.parseInt(params[1]);
            int number = Integer.parseInt(params[2]);
            
            for (int j = fromBucket; j <= toBucket; ++j) {
                bucket[j] = number;
            }
        }
        
		br.close();
        for (int i = 1; i < bucket.length; ++i) {
            bw.write(String.valueOf(bucket[i]));
            bw.write(" ");
        }
        bw.flush();
        bw.close();
		
	}
}