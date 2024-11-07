import java.io.BufferedReader;
import java.io.InputStreamReader;

interface Main {
    static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        String[] params = br.readLine().split(" ");
        
        int a = Integer.parseInt(params[0]);
        int b = Integer.parseInt(params[1]);
        int r = 0;
        if (a < b) {
            int temp = a;
            a = b;
            b = temp;
        }
        while (b != 0) {
            r = a % b;
            a = b;
            b = r;
        }
        System.out.println(a);
    }
}