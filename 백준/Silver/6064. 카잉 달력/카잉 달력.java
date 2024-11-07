import java.io.BufferedWriter;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;
import java.util.StringTokenizer;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        Main main = new Main();
        int loop = Integer.parseInt(br.readLine());
        int m = 0,
            n = 0,
            x = 0,
            y = 0;
        
        for (int i = 0; i < loop; ++i) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            m = Integer.parseInt(st.nextToken());
            n = Integer.parseInt(st.nextToken());
            x = Integer.parseInt(st.nextToken());
            y = Integer.parseInt(st.nextToken());
            bw.write(String.valueOf(m < n ? main.solution(m, n, x, y) : main.solution(n, m, y, x)) + "\n");
        }
        bw.flush();
    }
    
    int solution(int m, int n, int x, int y) {
        int target = x > n ? x - n : x;
        int count = x;
        while (target != y && m * n >= count) {
            target = target + m > n ? target + m - n : target + m;
            count += m;
        }
        if (count > m * n) {
            count = -1;
        }
        return count;
    }
}