import java.util.Scanner;

interface Main {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a    = sc.nextInt(),
            b    = sc.nextInt(),
            c    = sc.nextInt(),
            d    = sc.nextInt(),
            e    = sc.nextInt(),
            temp = 0;
        
        if (a > b) {
            temp = a;
            a    = b;
            b    = temp;
        }
        if (a > c) a    = c;
        System.out.println((a > b ? b : a) + (d < e ? d : e) - 50);
    }
}