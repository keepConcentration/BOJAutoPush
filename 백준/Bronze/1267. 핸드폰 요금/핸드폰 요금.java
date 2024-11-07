import java.util.Scanner;

import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int yResult = 0;
        int mResult = 0;
        String YM = "Y M ";
        
        int result = 0;
        
        for (int i = 0; i < n; ++i) {
        	int call = sc.nextInt();
        	yResult += ((call / 30) + 1) * 10;
        	mResult += ((call / 60) + 1) * 15;
        }
        
        if (yResult < mResult) {
        	YM = "Y ";
        	result = yResult;
        } else if (yResult > mResult) {
        	YM = "M ";
        	result = mResult;
        } else {
        	result = mResult;
        }
        System.out.println(YM + result);
    }
}