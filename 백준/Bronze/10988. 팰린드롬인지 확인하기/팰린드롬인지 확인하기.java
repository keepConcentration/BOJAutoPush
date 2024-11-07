import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

interface Main {
    static void main(String[] b) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String in = br.readLine();

        for (int i = 0, j = in.length() - 1; i < j; ++i, --j) {
            char firstChar = in.charAt(i);
            char secondChar = in.charAt(j);
            if (firstChar != secondChar) {
                bw.write("0");
                bw.flush();
                bw.close();
                return;
            }
        }
        bw.write("1");
        bw.flush();
        bw.close();
    }
}