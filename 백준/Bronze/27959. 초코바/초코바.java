import java.util.Scanner;
interface Main {
    static void main (String[]z) {
        Scanner s = new Scanner(System.in);
        int a = s.nextInt() * 100;
        int b = s.nextInt();
        if (a >= b) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}