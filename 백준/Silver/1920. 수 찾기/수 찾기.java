import java.util.Scanner;
import java.util.Arrays;
import java.io.OutputStreamWriter;
import java.io.BufferedWriter;
import java.io.IOException;

interface Main {
    static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuffer sb = new StringBuffer();
        
        int cnt1 = sc.nextInt();
        int[] a = new int[cnt1];
        for (int i = 0; i < cnt1; ++i) {
            a[i] = sc.nextInt();
        }
        
        Arrays.sort(a);
        
        int cnt2 = sc.nextInt();
        
        for (int i = 0; i < cnt2; ++i) {
            int b = sc.nextInt();
            
            if (binarySearch(a, b) >= 0) {
                sb.append("1\n");
            } else {
                sb.append("0\n");
            }
        }
        
        bw.write(sb.toString());
        bw.flush();
        sc.close();
        bw.close();
    }
    
    public static int binarySearch(int[] arr, int key) {
        int left = 0;
        int right = arr.length - 1;
        while (left <= right) {
            int mid = (left + right) / 2;
            
            if (key < arr[mid]) {
                right = mid - 1;
            } else if (key > arr[mid]) {
                left = mid + 1;
            } else {
                return mid;
            }
        }
        return -1;
    }
}