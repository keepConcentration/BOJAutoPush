import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.BufferedWriter;
import java.io.OutputStreamWriter;

interface Main {
    static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int i = Integer.parseInt(br.readLine());
        int result = 5;
        if (i > 5) {
            int remainder = (i - 5) % 8;
            switch (remainder) {
                case 4: 
                    result = 1;
                    break;
                case 3:
                case 5:
                    result = 2;
                    break;
                case 2:
                case 6:
                    result = 3;
                    break;
                case 1:
                case 7:
                    result = 4;
                    break;
            }
        } else {
            result = i;
        }
        
        System.out.println(result);
    }
}