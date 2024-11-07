import java.io.BufferedReader;
import java.io.InputStreamReader;

interface Main {
    static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int a = 0;
        int b = 0;
        int c = 0;
        int temp = 0;
        String line = "";
        String result = "";
        while (!(line = br.readLine()).equals("0 0 0")) {
            String[] arr = line.split(" ");
            a = Integer.parseInt(arr[0]);
            b = Integer.parseInt(arr[1]);
            c = Integer.parseInt(arr[2]);
            if (a < b) {
                temp = a;
                a = b;
                b = temp;
            }
            if (b < c) {
                temp = b;
                b = c;
                c = temp;
            }
            if (a < b) {
                temp = a;
                a = b;
                b = temp;
            }
            if (Math.pow(a, 2) == Math.pow(b, 2) + Math.pow(c, 2)) {
                result += "right\n";
            } else {
                result += "wrong\n";
            }
        }
        System.out.println(result);
    }
}