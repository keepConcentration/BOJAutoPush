import java.util.Scanner;

interface Main {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        System.out.println(a % 2024 == 0 && a < 100001 ? "Yes" : "No");
    }
}
