import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        String a = br.readLine();
        String b = br.readLine();
        String c = br.readLine();
        br.close();
        
        int result = 0;

        if (isNumber(a)) {
            result = Integer.parseInt(a) + 3;
        }
        if (isNumber(b)) {
            result = Integer.parseInt(b) + 2;
        }
        if (isNumber(c)) {
            result = Integer.parseInt(c) + 1;
        }

        if (result % 3 == 0 && result % 5 == 0) {
            bw.write("FizzBuzz\n");
        } else if (result % 5 == 0) {
            bw.write("Buzz\n");
        } else if (result % 3 == 0) {
            bw.write("Fizz\n");
        } else {
            bw.write(String.valueOf(result));
        }
        bw.flush();
        bw.close();
    }

    private static boolean isNumber(String str) {
        try {
            Integer.parseInt(str);
        } catch (NumberFormatException e) {
            return false;
        }
        return true;
    }
}