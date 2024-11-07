import java.util.Scanner;

interface Main {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        int max = sc.nextInt();
        int plus = sc.nextInt();
        int target = sc.nextInt();
        int resultA = A * target;
        int resultB = B;
        target -= max;
        if (target > 0) {
            resultB += target * plus;
        }
        System.out.println(resultA < resultB ? resultA : resultB);
    }
}