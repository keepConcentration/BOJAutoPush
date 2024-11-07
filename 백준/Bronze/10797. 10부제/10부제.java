import java.util.Scanner;

interface Main {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int result = 0;
        for (int i = 0; i < 5; ++i) {
            if (A == sc.nextInt()) {
                result++;
            }
        }
        System.out.println(result);
    }
}