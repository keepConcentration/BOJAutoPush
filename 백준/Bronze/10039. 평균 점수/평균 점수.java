import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        int result = 0;
        for (int i = 0; i < 5; ++i) {
            int score = Integer.parseInt(br.readLine());
            if (score < 40) {
                score = 40;
            }
            result += score;
        }
        bw.write(result / 5 + "\n");
        bw.flush();
    }
}