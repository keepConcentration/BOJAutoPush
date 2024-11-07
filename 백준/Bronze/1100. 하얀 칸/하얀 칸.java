import java.io.BufferedReader;
import java.io.InputStreamReader;
interface Main {
    static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int result = 0;
        for (int i = 0; i < 8; ++i) {
            String line = br.readLine();
            
            for (int j = 0; j < 8; ++j) {
                char cha = line.charAt(j);
                    
                if (cha == 'F') {
                    if (i % 2 == 0 && j % 2 == 0) {
                        result++;
                    } else if (i % 2 == 1 && j % 2 == 1) {
                        result++;
                    }
                }
            }
        }
        System.out.println(result);
    }
}