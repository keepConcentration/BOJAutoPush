import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

interface Main {
    static void main(String[] b) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();
        String[][] arr = new String[5][15];


        for (int i = 0; i < 5; ++i) {
            arr[i] = br.readLine().split("");
        }
        br.close();

        for (int i = 0; i < 15; ++i) {
            for (int j = 0; j < 5; ++j) {
                try {
                    if (arr[j][i] != null) {
                        sb.append(arr[j][i]);
                    }
                } catch (ArrayIndexOutOfBoundsException e) {
                    
                }
            }
        }
        bw.write(sb.toString());
        bw.flush();
        bw.close();
    }
}