import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

class Main {
    public static void main(String[] b) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] arr = br.readLine().split(" ");

        br.close();
        int target = Integer.parseInt(arr[0]);
        int num = Integer.parseInt(arr[1]);
        StringBuilder result = new StringBuilder();
        while (target != 0) {
            result.append(getNum(target % num));
            target /= num;
        }

        bw.write(String.valueOf(result.reverse()));
        bw.flush();
        bw.close();
    }

    private static String getNum(int a) {
        if (a < 10) {
            return String.valueOf(a);
        }
        return String.valueOf((char)(a + 55));
    }
}