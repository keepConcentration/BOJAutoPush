import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String scanInt = sc.nextLine();
		int totDay = 0;
		if(Integer.parseInt(scanInt.split(" ")[0]) != 1) {
			for(int i=1; i<=Integer.parseInt(scanInt.split(" ")[0])-1; i++) {
				if(i == 1||i == 3||i == 5||i == 7||i == 8||i == 10||i == 12) {
					totDay += 31;
				} else if(i == 2) {
					totDay += 28;
				} else {
					totDay += 30;
				}
			}
			totDay += Integer.parseInt(scanInt.split(" ")[1]);
		} else {
			totDay = Integer.parseInt(scanInt.split(" ")[1]);
		}
		
		switch(totDay % 7){
		case 0 : System.out.print("SUN"); break;
		case 1 : System.out.print("MON"); break;
		case 2 : System.out.print("TUE"); break;
		case 3 : System.out.print("WED"); break;
		case 4 : System.out.print("THU"); break;
		case 5 : System.out.print("FRI"); break;
		case 6 : System.out.print("SAT"); break;
		}
	}
}
