import java.io.BufferedReader;
import java.io.InputStreamReader;

interface Main {
    static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n + 1];
        arr[0] = 0;
        arr[1] = 1;
        int result = 0;
        if (n > 1) {
            for (int i = 2; i <= n; ++i) {
                arr[i] = arr[i-1] + arr[i-2];
            }
        }
        
        System.out.println(arr[n]);
    }
    
    static int F(int n) {
        if (n == 0) {
            return 0;
        }
        if (n == 1) {
            return 1;
        }
        return F(n - 1) + F(n - 2);
    }
}