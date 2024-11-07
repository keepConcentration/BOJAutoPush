import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();
        String in;
        
        while ((in = br.readLine()) != null) {
            int N = (int) Math.pow(3, Integer.parseInt(in));
            StringBuilder str = new StringBuilder();
            for (int i = 0; i < N; ++i) {
                str.append("-");
            }
            sb.append(solution(str.toString())).append("\n");
        }

        bw.write(sb.toString());
        bw.flush();
        bw.close();
    }

    public static String solution(String str) {
        if (str.length() == 1) {
            return str;
        }
        return solution(str.substring(0, str.length() / 3))
                + str.substring(str.length() / 3, str.length() / 3 * 2).replace("-", " ")
                + solution(str.substring(str.length() / 3 * 2));
    }
}