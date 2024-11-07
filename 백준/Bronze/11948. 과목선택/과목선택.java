import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        int b = s.nextInt();
        int c = s.nextInt();
        int d = s.nextInt();
        int e = s.nextInt();
        int f = s.nextInt();
        
        int min = a;
        
        int result = (e < f ? f : e) + a + b + c + d;
        
        if (min > b) min = b;
        if (min > c) min = c;
        if (min > d) min = d;
        
        System.out.println(result - min);
    }
}