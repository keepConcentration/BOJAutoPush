import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.BufferedWriter;
import java.io.OutputStreamWriter;
import java.io.IOException;

interface Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String[] sizes = br.readLine().split(" ");
        int size1 = Integer.parseInt(sizes[0]);
        int size2 = Integer.parseInt(sizes[1]);
        int[][] result = new int[size1][size2];
        
        for (int i = 0; i < 2; ++i) {
            for (int j = 0; j < size1; ++j) {
                String[] input = br.readLine().split(" ");
                for (int k = 0; k < size2; ++k) {
                    result[j][k] += Integer.parseInt(input[k]);
                }
            }
        }
        
        for (int i = 0; i < size1; ++i) {
            for (int j = 0; j < size2; ++j) {
                bw.write(result[i][j] + " ");
            }
            bw.write("\n");
        }
        bw.flush();
        bw.close();
        br.close();
    }
}