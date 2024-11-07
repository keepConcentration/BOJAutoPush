import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		int rollNum = Integer.parseInt(sc.nextLine());
		String[] inVal = new String[rollNum];
		
		for(int i=0; i<rollNum; i++) {
			inVal[i] = sc.nextLine();
			double h = Double.parseDouble(inVal[i].split(" ")[0]);
			double n = Double.parseDouble(inVal[i].split(" ")[2]);
			System.out.println((int)(Math.floor(n % h) == 0 ? h : Math.floor(n % h))*100 + (int)Math.ceil(n / h));
		}
    }
}