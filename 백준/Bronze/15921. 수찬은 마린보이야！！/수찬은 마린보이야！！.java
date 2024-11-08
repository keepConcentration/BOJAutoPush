import java.util.Scanner;
interface Main {
    static void main(String[]z) {
        if (new Scanner(System.in).nextInt() == 0) {
            System.out.println("divide by zero");
        } else {
            System.out.println("1.00");
        }
    }
}