import java.util.Scanner;

interface Main {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();
        int e = sc.nextInt();
        
        int result = 0;
        
        if (a < 0) {
            result += c * Math.abs(a);
            a = 0;
        }
        if (a == 0) {
            result += d;
        }
        if (a != b) {
            result += e * (b - a);
        }
        
        System.out.println(result);
    }
}