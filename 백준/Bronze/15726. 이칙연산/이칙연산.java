import java.util.Scanner;

interface Main {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double a = sc.nextInt();
        double b = sc.nextInt();
        double c = sc.nextInt();

        System.out.println(Math.max((int)(a * b / c), (int)(a / b * c)));
    }
}