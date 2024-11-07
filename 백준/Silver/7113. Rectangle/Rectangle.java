import java.io.BufferedReader;
import java.io.InputStreamReader;

interface Main {
    static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] params = br.readLine().split(" ");
        int a = Integer.parseInt(params[0]);
        int b = Integer.parseInt(params[1]);
        int result = 1;
        int temp = 0;
        while (a != b) {
            if (a < b) {
                temp = a;
                a = b;
                b = temp;
            }
            a = a - b;
            result++;
        }
        System.out.println(result);
    }
}