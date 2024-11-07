import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();
        int result = 1;
        if(input == 1) {
            System.out.print(result);
        } else {
            int dbr = 1;
            for(int i = 1; i <= input; i++) {
                dbr += i * 6;
                if(input <= dbr) {
                    result += i;
                    System.out.println(result);
                    break;
                }
            }
        }
    }
}