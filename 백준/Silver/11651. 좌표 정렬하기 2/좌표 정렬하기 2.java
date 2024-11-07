import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;
import java.util.Comparator;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();
        int loop = Integer.parseInt(br.readLine());
        
        int[][] arr = new int[loop][2];
        
        for (int i = 0; i < loop; ++i) {
            String[] param = br.readLine().split(" ");
            int x = Integer.parseInt(param[0]);
            int y = Integer.parseInt(param[1]);
            
            arr[i][0] = x;
            arr[i][1] = y;
        }
        
        br.close();
        
        Arrays.sort(arr, new Comparator<int[]>() {
            // 0:x, 1:y
            @Override
            public int compare(int[] a, int[] b) {
                if (a[1] == b[1]) {
                    return a[0] - b[0];
                }
                return a[1] - b[1];
            }
        });
        
        for (int i = 0; i < loop; ++i) {
            sb.append(String.valueOf(arr[i][0]));
            sb.append(" ");
            sb.append(String.valueOf(arr[i][1]));
            sb.append("\n");
        }
        
        bw.write(sb.toString());
        bw.flush();
        bw.close();
    }
}