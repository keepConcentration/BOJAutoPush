import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();
        int p = sc.nextInt();
        int m = sc.nextInt();
        int n = sc.nextInt();
        
        int atkP = 0;
        int atkM = 0;
        int atkN = 0;
        
    	if (p % (a + b) != 0 && p % (a + b) <= a) {
    		atkP++;
    	}
    	if (p % (c + d) != 0 && p % (c + d) <= c) {
    		atkP++;
    	}
    	
    	if (m % (a + b) != 0 && m % (a + b) <= a) {
    		atkM++;
    	}
    	if (m % (c + d) != 0 && m % (c + d) <= c) {
    		atkM++;
    	}
    	
    	if (n % (a + b) != 0 && n % (a + b) <= a) {
    		atkN++;
    	}
    	if (n % (c + d) != 0 && n % (c + d) <= c) {
    		atkN++;
    	}
    	
    	System.out.println(atkP);
    	System.out.println(atkM);
    	System.out.println(atkN);
    	
    }
}