import java.util.Scanner;

interface Main {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt(),
            b = sc.nextInt(),
            c = sc.nextInt();
        
        if (a * b <= c) {
            System.out.println(0);
        } else {
            System.out.println(Math.abs(c - a * b));
        }
    }
}