import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;
import static java.lang.Integer.parseInt;

class Main {
    static int cnt_1 = 0;
    static int cnt0 = 0;
    static int cnt1 = 0;
    
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuffer sb = new StringBuffer();
        
        int N = parseInt(br.readLine());
        
        int[][] arr = new int[N][N];
        
        for (int i = 0; i < N; ++i) {
            String[] strArr = br.readLine().split(" ");
            for (int j = 0; j < N; ++j) {
                arr[i][j] = parseInt(strArr[j]);
            }
        }
        
        cut(0, 0, N, arr);
        
        sb.append(cnt_1).append("\n");
        sb.append(cnt0).append("\n");
        sb.append(cnt1).append("\n");
        bw.write(sb.toString());
        bw.flush();
        bw.close();
        br.close();
    }
    
    public static void cut(int startX, int startY, int size, int[][] arr) {
        
        if (size == 1) {
            if (arr[startX][startY] == -1) {
                cnt_1++;
            } else if (arr[startX][startY] == 0) {
                cnt0++;
            } else {
                cnt1++;
            }
            return;
        }
        int start = arr[startX][startY];
        boolean isAllEquals = true;
        l:for (int i = startX; i < startX + size; ++i) {
            for (int j = startY; j < startY + size; ++j) {
                if (start != arr[i][j]) {
                    isAllEquals = false;
                    break l;
                }
            }
        }
        
        if (isAllEquals) {
            if (start == -1) {
                cnt_1++;
            } else if (start == 0) {
                cnt0++;
            } else {
                cnt1++;
            }
            return;
        }
        int size2 = size / 3;
        cut(startX, startY, size2, arr);
        cut(startX + size2, startY, size2, arr);
        cut(startX + size2 * 2, startY, size2, arr);
        
        cut(startX, startY + size2, size2, arr);
        cut(startX + size2, startY + size2, size2, arr);
        cut(startX + size2 * 2, startY + size2, size2, arr);
        
        cut(startX, startY + size2 * 2, size2, arr);
        cut(startX + size2, startY + size2 * 2, size2, arr);
        cut(startX + size2 * 2, startY + size2 * 2, size2, arr);
    }
    
}