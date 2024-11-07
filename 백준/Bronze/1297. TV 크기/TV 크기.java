import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int a = sc.nextInt();
        int h = sc.nextInt();
        int w = sc.nextInt();
        
        double multi = Math.sqrt(Math.pow(a, 2)/(Math.pow(h, 2) + Math.pow(w, 2)));
        
        System.out.println((int)(h * multi) + " " +  (int)(w * multi));
    }
}