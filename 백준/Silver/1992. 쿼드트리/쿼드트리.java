import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;
import static java.lang.Integer.parseInt;

class Main {
    static StringBuffer sb = new StringBuffer();
    
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        
        int N = parseInt(br.readLine());
        
        int[][] arr = new int[N][N];
        
        for (int i = 0; i < N; ++i) {
            String[] strArr = br.readLine().split("");
            for (int j = 0; j < N; ++j) {
                arr[i][j] = parseInt(strArr[j]);
            }
        }
        
        sb.append(compression(0, 0, N, arr)).append("\n");
        
        bw.write(sb.toString());
        bw.flush();
        bw.close();
        br.close();
    }
    
    public static String compression(int startX, int startY, int size, int[][] arr) {
        
        if (size == 1) {
            return String.valueOf(arr[startX][startY]);
        }
        
        int startColor = arr[startX][startY];
        boolean isAllEquals = true;
        l:for (int i = startX; i < startX + size; ++i) {
            for (int j = startY; j < startY + size; ++j) {
                if (startColor != arr[i][j]) {
                    isAllEquals = false;
                    break l;
                }
            }
        }
        
        if (isAllEquals) {
            return String.valueOf(startColor);
        }
        int size2 = size / 2;
        String result = "(";
        result += compression(startX, startY, size2, arr);
        result += compression(startX, startY + size2, size2, arr);
        result += compression(startX + size2, startY, size2, arr);
        result += compression(startX + size2, startY + size2, size2, arr);
        result += ")";
        return result;
    }
    
}