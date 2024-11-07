import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int loop = sc.nextInt();
        int left = 0;
        int leftH = 0;
        int right = 0;
        int rightH = 0;
        int[] trop = new int[loop];
        for (int i = 0; i < loop; ++i) {
        	trop[i] = sc.nextInt();
        }
        
        for (int i = 0 ; i < loop; ++i) {
        	if (leftH < trop[i]) {
        		leftH = trop[i];
        		left++;
        	}
        }
        for (int i = loop - 1; i >= 0; --i) {
        	if (rightH < trop[i]) {
        		rightH = trop[i];
        		right++;
        	}
        }
        
        System.out.println(left);
        System.out.println(right);
    }
}