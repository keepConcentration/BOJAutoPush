import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int loop = Integer.parseInt(br.readLine());
        String resultStr = "";
        
        for (int i = 0; i < loop; ++i) {
        	int result = 0;
        	String line = br.readLine();
        	for (int j = 0; j < 10; ++j) {
        		if (line.indexOf(String.valueOf(j)) != -1) {
        			result++;
        		}
        	}
        	resultStr += result + "\n";
        }
        System.out.println(resultStr);
    }
}