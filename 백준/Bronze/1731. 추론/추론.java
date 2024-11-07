import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();
        int N = Integer.parseInt(br.readLine());


        int in1 = Integer.parseInt(br.readLine());
        int in2 = Integer.parseInt(br.readLine());
        int in3 = Integer.parseInt(br.readLine());

        int sub = 0;
        int multi = 0;

        if ((in3 - in2) == (in2 - in1)) {
            sub = in3 - in2;
        } else {
            multi = in2 / in1;
        }

        int lastNum = in3;

        for (int i = 3; i < N; ++i) {
            lastNum = Integer.parseInt(br.readLine());
        }
        if (sub != 0) {
            lastNum += sub;
        } else {
            lastNum *= multi;
        }
        sb.append(lastNum);

        bw.write(sb.toString());
        bw.flush();
        bw.close();
    }
}