import java.util.Scanner;

interface Main {
    static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int a = s.nextInt() + 1;
        int b = s.nextInt() + 1;
        int c = s.nextInt() + 1;
        
        System.out.println(a * b / c - 1);
    }
}