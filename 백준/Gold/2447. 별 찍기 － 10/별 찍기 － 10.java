import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    static char[][] charArr;
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int loop = Integer.parseInt(br.readLine());
        charArr = new char[loop][loop];
        
        for (int i = 0; i < loop; ++i) {
            for (int j = 0; j < loop; ++j) {
                charArr[i][j] = ' ';
            }
        }
        
        star(0, 0, loop);
        
        for (int i = 0; i < loop; ++i) {
            for (int j = 0; j < loop; ++j) {
                sb.append(charArr[j][i]);
            }
            if (i != loop - 1) {
                sb.append("\n");
            }
        }
        
        System.out.print(sb.toString());
        br.close();
    }
    
    static void star(int x, int y, int cnt) {
        int parmCnt = cnt / 3;
        if (parmCnt == 1) {
            for (int i = 0; i < 3; ++i) {
                for (int j = 0; j < 3; ++j) {
                    if (i == 1 && j == 1) {
                        charArr[x + i][y + j] = ' ';
                    } else {
                        charArr[x + i][y + j] = '*';
                    }
                }
            }
        } else {
            for (int i = 0; i < 3; ++i) {
                for (int j = 0; j < 3; ++j) {
                    if (i != 1 || j != 1) {
                        int parmX = x + i * parmCnt;
                        int parmY = y + j * parmCnt;
                        
                        star(parmX, parmY, parmCnt);
                    }
                }
            }
        }
    }
}