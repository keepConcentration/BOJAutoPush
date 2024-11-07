import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
    static int[] stroke = {3, 2, 1, 2, 3, 3, 2, 3, 3, 2, 2, 1, 2, 2, 1, 2, 2, 2, 1, 2, 1, 1, 1, 2, 2, 1};
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String a = br.readLine();
        String b = br.readLine();
        br.close();

        Integer[] arr = new Integer[a.length() + b.length()];

        StringBuilder sb = new StringBuilder();



        int ii = 0;
        for (int i = 0; i < a.length(); ++i) {
            char aa = a.charAt(i);
            char bb = b.charAt(i);

            arr[ii] = stroke[aa - 'A'];
            ii++;
            arr[ii] = stroke[bb - 'A'];
            ii++;
        }

        int max = arr.length;
        while (true) {
            if (max == 2) {
                break;
            }
            for (int j = 0; j < max - 1; ++j) {
                int first = arr[j];
                int second = arr[j + 1];
                arr[j] = (first + second) % 10;
            }
            max--;
        }


        sb.append(String.format("%02d", arr[0] * 10 + arr[1])).append("\n");
        bw.write(sb.toString());
        bw.flush();
        bw.close();
    }
}