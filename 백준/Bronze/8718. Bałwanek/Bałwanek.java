import java.util.Scanner;

interface Main {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int k = sc.nextInt();
        int a = 0;
        int b = 0;
        int c = 0;
        int temp = 0;
        
        if (7000 * k <= 1000 * x) a = 7000 * k;
        if (3500 * k <= 1000 * x) b = 3500 * k;
        if (1750 * k <= 1000 * x) c = 1750 * k;
        
        if (a < b) {
            temp = a;
            a = b;
            b = a;
        }
        
        if (b < c) {
            temp = b;
            b = c;
            c = temp;
        }
        
        if (a < b) {
            temp = a;
            a = b;
            b = a;
        }
        System.out.println(a);
    }
}