import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();
        String[] inArr = br.readLine().split(" ");

        int Q = Integer.parseInt(inArr[1]);
        char[] S = br.readLine().toCharArray();

        while (Q-- > 0) {
            inArr = br.readLine().split(" ");
            int l = Integer.parseInt(inArr[1]);
            int r = Integer.parseInt(inArr[2]);
            if (inArr[0].equals("1")) {
                int count = 0;
                char temp = '-';
                for (int i = l - 1; i < r; ++i) {
                    if (temp != S[i]) {
                        count++;
                        temp = S[i];
                    }
                }
                sb.append(count).append("\n");
            } else {
                for (int i = l - 1; i < r; ++i) {
                    if (S[i] == 'Z') {
                        S[i] = 'A';
                    } else {
                        S[i] = (char) (S[i] + 1);
                    }
                }
            }
        }

        bw.write(sb.toString());
        bw.flush();
        bw.close();
    }
}