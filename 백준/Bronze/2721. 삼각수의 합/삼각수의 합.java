import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int loop = sc.nextInt();
        String resultStr = "";
        for (int i = 0 ; i < loop; ++i) {
        	resultStr += W(sc.nextInt()) + "\n";
        }
        
        System.out.println(resultStr);
    }
	
	public static int W(int n) {
		int result = 0;
		for (int i = 1; i <= n; ++i) {
			result += i * T(i + 1);
		}
		return result;
	}
	
	public static int T(int n) {
		int result = 0;
		for (int i = 1; i <= n; ++i) {
			result += i;
		}
		return result;
	}
}