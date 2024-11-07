import java.util.Scanner;

interface Main {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();
        int result = 0;
        
        while (A < B) {
            A += C;
            result++;
        }
        
        System.out.println(result);
    }
}