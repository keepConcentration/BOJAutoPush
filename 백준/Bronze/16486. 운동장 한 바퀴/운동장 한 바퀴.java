import java.util.Scanner;
interface Main {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt() * 2;
        
        System.out.println(a * 2 + b * 3.141592);
        
    }
}