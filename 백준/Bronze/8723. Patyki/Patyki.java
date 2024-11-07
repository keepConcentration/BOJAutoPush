import java.util.Scanner;
/*
0 - Byteus가 직각 삼각형이나 정삼각형을 만들 수 없는 경우
1 - Byteus가 직각 삼각형만 만들 수 있는 경우
2 - Byteus가 정삼각형만 만들 수 있는 경우
*/
interface Main {
    static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int temp = 0;
        
        
        if (a == b && a == c) {
            System.out.println(2);
        } else {
            if (a < b) {
                temp = a;
                a = b;
                b = temp;
            }
            if (b < c) {
                temp = b;
                b = c;
                c = temp;
            }
            if (a < b) {
                temp = a;
                a = b;
                b = temp;
            }
            if (Math.pow(b, 2) + Math.pow(c, 2) == Math.pow(a, 2)) {
                System.out.println(1);
            } else {
                System.out.println(0);
            }
        }
    }
}