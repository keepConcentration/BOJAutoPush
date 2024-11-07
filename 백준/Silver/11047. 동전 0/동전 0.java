import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String[] inArr = br.readLine().split(" ");
        int count = Integer.parseInt(inArr[0]);
        int amount = Integer.parseInt(inArr[1]);
        
        int result = 0;
        int[] coinArr = new int[count];
        for (int i = count - 1; i >= 0; --i) {
            coinArr[i] = Integer.parseInt(br.readLine());
        }
        br.close();
        for (int i = 0; i < count; ++i) {
            if (coinArr[i] <= amount) {
                result += (amount / coinArr[i]);
                amount = (amount % coinArr[i]);
            }
        }
        bw.write("" + result);
        bw.write("\n");
        bw.flush();
        bw.close();
    }
}