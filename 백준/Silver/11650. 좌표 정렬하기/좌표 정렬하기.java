import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.BufferedWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();
        
        int loop = Integer.parseInt(br.readLine());
        int[][] cntArr = new int[loop][2];
        
        for (int i = 0; i < loop; ++i) {
            String[] param = br.readLine().split(" ");
            int x = Integer.parseInt(param[0]);
            int y = Integer.parseInt(param[1]);
            
            cntArr[i][0] = x;
            cntArr[i][1] = y;
        }
        
        Arrays.sort(cntArr, new Comparator<int[]>() {
            @Override
            public int compare(int[] arrX, int[] arrY) {
                if (arrX[0] == arrY[0]) {
                    return arrX[1] - arrY[1];
                } else {
                    return arrX[0] - arrY[0];
                }
            }
        });
        
        for (int i = 0; i < loop; ++i) {
            sb.append(String.valueOf(cntArr[i][0]));
            sb.append(" ");
            sb.append(String.valueOf(cntArr[i][1]));
            sb.append("\n");
        }
        
        bw.write(sb.toString());
        bw.flush();
        bw.close();
        br.close();
    }
}