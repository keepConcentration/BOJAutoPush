import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();
        int loop = Integer.parseInt(br.readLine());
        int[] cntArr = new int[8001];
        
        int add = 0;
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        int center = -10000;
        int mode = -10000;
        
        for (int i = 0; i < loop; ++i) {
            int param = Integer.parseInt(br.readLine());
            add += param;
            if (param > max) {
                max = param;
            }
            
            if (param < min) {
                min = param;
            }
            cntArr[param + 4000]++;
        }
        
        //산술평균
        int avg = (int)Math.round((double)add / loop);
        
        //중앙값
        int centerCnt = 0;
        
        // 최빈값
        int modeMax = -10000;
        boolean flag = false;
        for (int i = 4000 + min; i < max + 4001; ++i) {
            if (cntArr[i] != 0) {
                if (centerCnt < (loop + 1) / 2) {
                    centerCnt += cntArr[i];
                    center = i - 4000;
                }
                
                if (modeMax < cntArr[i]) {
                    modeMax = cntArr[i];
                    mode = i - 4000;
                    flag = true;
                } else if (modeMax == cntArr[i] && flag) {
                    mode = i - 4000;
                    flag = false;
                }
            }
        }
        bw.write(String.valueOf(avg));
        bw.write("\n");
        bw.write(String.valueOf(center));
        bw.write("\n");
        bw.write(String.valueOf(mode));
        bw.write("\n");
        bw.write(String.valueOf(max - min));
        bw.write("\n");
        bw.flush();
        bw.close();
        br.close();
    }
}