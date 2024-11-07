import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[9];
        int sum = 0;
        
        for (int i = 0; i < 9; ++i) {
            arr[i] = sc.nextInt();
            sum += arr[i];
        }
                
        Arrays.sort(arr);
        
        l:for (int i = 0; i < 8; ++i) {
            int two = arr[i];
            for (int j = i + 1; j < 9; ++j) {
                two += arr[j];
                if (sum - two == 100) {
                    arr[i] = 0;
                    arr[j] = 0;
                    break l;
                }
                two = arr[i];
            }
        }
        
        for (int i = 0; i < 9; ++i) {
            if (arr[i] != 0) {
                System.out.println(arr[i]);
            }
        }
    }
}