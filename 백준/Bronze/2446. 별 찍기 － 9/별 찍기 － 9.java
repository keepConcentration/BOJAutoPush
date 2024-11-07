import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int param = sc.nextInt();
        for (int i = 0; i < param; ++i) {
        	
        	for (int j = 0; j < param - 1; ++j) {
        		if (i - 1 < j) {
        			System.out.print("*");
        		} else {
        			System.out.print(" ");
        		}
        	}
        	
        	for (int j = 0; j < param; ++j) {
        		if ((param - i - 1) >= j) {
            		System.out.print("*");
            	}
        	}
        	System.out.println();
        }
        
        for (int i = 1; i < param; ++i) {
        	for (int j = 0; j < param; ++j) {
        		if (param - j - 1 > i) {
        			System.out.print(" ");
        		} else {
        			System.out.print("*");
        		}
        	}
        	
        	for (int j = 0; j < param; ++j) {
        		if ((param - i - 1) < j) {
            		System.out.print("*");
            	}
        	}
        	System.out.println();
        }
        
    }
}