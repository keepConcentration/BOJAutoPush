import java.util.Scanner;
public class Main{
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
		int rollNum = Integer.parseInt(sc.nextLine());
		String[] inVal = new String[rollNum];
		
		for(int i=0; i<rollNum; i++) {
			inVal[i] = sc.nextLine();
			int param = Integer.parseInt(inVal[i].split(" ")[1]) - Integer.parseInt(inVal[i].split(" ")[0]);
			int incr = 0;
			int result = 0;
			lbl: while(true) {
				for(int j=0; j<=1; j++) {
					param -= j==0 ? ++incr : incr;
					result++;
					if(param <= 0) break lbl;
				}
			}
			System.out.println(result);
		}
    }
}