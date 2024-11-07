import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		int rollNum = Integer.parseInt(sc.nextLine());
		String[] inValue = new String[rollNum];
		for(int h = 0; h < rollNum; h++) {
			int k = Integer.parseInt(sc.nextLine());
			int n = Integer.parseInt(sc.nextLine());
			int array[] = new int[n];
			for(int i=0; i<n; i++) {
				array[i] = i+1;
			}
			for(int i=0; i<k; i++) {
				for(int j=1; j<n; j++) {
					array[j] = array[j-1]+array[j];
				}
			}
			inValue[h] = String.valueOf(array[n-1]);
		}
		for(int i=0; i<rollNum; i++) {
			System.out.println(inValue[i]);
		}
    }
}

