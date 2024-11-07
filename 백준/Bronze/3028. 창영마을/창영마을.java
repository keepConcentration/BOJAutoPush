import java.util.Scanner;

interface Main {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int result1 = 1;
        int result2 = 0;
        int result3 = 0;
        int temp = 0;
        
        String param = sc.next();
        for (int i = 0; i < param.length(); ++i) {
            char cha = param.charAt(i);
            if (cha == 'A') {
                temp = result1;
                result1 = result2;
                result2 = temp;
            } else if (cha == 'B') {
                temp = result2;
                result2 = result3;
                result3 = temp;
            } else {
                temp = result3;
                result3 = result1;
                result1 = temp;
            }
        }
        if (result1 == 1) {
            System.out.println("1");
        } else if (result2 == 1) {
            System.out.println("2");
        } else {
            System.out.println("3");
        }
    }
}