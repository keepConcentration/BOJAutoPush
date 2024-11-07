import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
		String param = sc.nextLine().replaceAll("9","6")+" ";
		int value = 0;
		for(int i=0; i<=8; i++) {
			value = 
				i != 6
				? (param.split(String.valueOf(i)).length-1 > value ? param.split(String.valueOf(i)).length-1 : value)
				: (int)(Math.ceil((double)(param.split(String.valueOf(i)).length-1)/2)) > value
				? (int)(Math.ceil((double)(param.split(String.valueOf(i)).length-1)/2)) : value;
		}
		System.out.println(value);
    }
}