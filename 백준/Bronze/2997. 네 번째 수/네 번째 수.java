import java.io.BufferedReader;
import java.io.InputStreamReader;
interface Main {
    static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] params = br.readLine().split(" ");
        int a = Integer.parseInt(params[0]);
        int b = Integer.parseInt(params[1]);
        int c = Integer.parseInt(params[2]);
        int temp = 0;
        
        if (a > b) {
            temp = b;
            b = a;
            a = temp;
        }
        if (b > c) {
            temp = c;
            c = b;
            b = temp;
        }
        if (a > b) {
            temp = b;
            b = a;
            a = temp;
        }
        int ab = b - a;
        int bc = c - b;
        if (ab == bc) {
            System.out.println(c + ab);
        } else if (ab < bc) {
            System.out.println(b + ab);
        } else {
            System.out.println(a + bc);
        }
        
    }
}
