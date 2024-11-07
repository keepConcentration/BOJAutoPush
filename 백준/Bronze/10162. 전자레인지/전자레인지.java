import java.util.Scanner;

interface Main {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int aCnt = 0,
            bCnt = 0,
            cCnt = 0,
            target = sc.nextInt();
        
        while (target >= 300) {
            target -= 300;
            aCnt++;
        }
        while (target >= 60) {
            target -= 60;
            bCnt++;
        }
        while (target >= 10) {
            target -= 10;
            cCnt++;
        }
        if (target != 0) {
            System.out.println(-1);
        } else {
            System.out.println(aCnt + " " + bCnt + " " + cCnt);
        }
        
    }
}