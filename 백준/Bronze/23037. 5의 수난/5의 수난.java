import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.BufferedWriter;
import java.io.OutputStreamWriter;

public class Main {
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();
        String[] param = br.readLine().split("");
        int result = 0;
        
        for (int i = 0; i < param.length; ++i) {
            result += Math.pow(Integer.parseInt(param[i]), 5);
        }
        sb.append(String.valueOf(result));
        bw.write(sb.toString());
        bw.write("\n");
        bw.flush();
        bw.close();
        br.close();
	}
		
}