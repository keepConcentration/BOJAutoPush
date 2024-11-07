import java.util.Scanner;
import java.math.BigDecimal;

interface Main {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = 0;
        String res = "";
        
        while ((n = sc.nextInt()) != 0) {
            String toStr = String.valueOf(n);
            int result = toStr.length() + 1;
            
            for (int i = 0; i < toStr.length(); ++i) {
                char cha = toStr.charAt(i);
                if (cha == '0') {
                    result += 4;
                } else if (cha == '1') {
                    result += 2;
                } else {
                    result += 3;
                }
            }
            res += result + "\n";
        }
        System.out.print(res);
    }
}