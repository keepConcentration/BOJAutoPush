import java.util.Scanner;

interface Main {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long a = sc.nextLong();
        double sqrt = Math.sqrt(a);
        System.out.println(sqrt * 4);
    }
}