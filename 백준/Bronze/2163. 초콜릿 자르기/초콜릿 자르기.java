import java.io.BufferedReader;
import java.io.InputStreamReader;

interface Main {
    static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] param = br.readLine().split(" ");
        int a = Integer.parseInt(param[0]);
        int b = Integer.parseInt(param[1]);
        
        System.out.println(a * b - 1);
    }
}