import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;

interface Main {
    static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int loop = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        int[] xArr = new int[loop];
        int[] yArr = new int[loop];
        for (int i = 0; i < loop; ++i) {
            String[] param = br.readLine().split(" ");
            xArr[i] = Integer.parseInt(param[0]);
            yArr[i] = Integer.parseInt(param[1]);
        }
        
        for (int i = 0; i < loop; ++i) {
            int grade = 1;
            for (int j = 0; j < loop; ++j) { 
                if (j == i) {
                    continue;
                }
                if (xArr[i] < xArr[j] && yArr[i] < yArr[j]) {
                    grade++;
                }
            }
            sb.append(grade);
            sb.append(" ");
        }
        sb.append("\n");
        bw.write(sb.toString());
        bw.flush();
        bw.close();
    }
}