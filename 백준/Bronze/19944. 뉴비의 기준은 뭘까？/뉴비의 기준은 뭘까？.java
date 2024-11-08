import java.util.Scanner;

interface Main {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int N = sc.nextInt();
        int M = sc.nextInt();
        
        if (3 > M) {
            System.out.println("NEWBIE!");
        } else if (N >= M) {
            System.out.println("OLDBIE!");
        } else {
            System.out.println("TLE!");
        }
    }
}