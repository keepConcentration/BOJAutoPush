import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;

interface Main {
    static void main(String[] b) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();

        String[] arr = br.readLine().split(" ");
        int[] arr2 = {Integer.parseInt(arr[0]), Integer.parseInt(arr[1]), Integer.parseInt(arr[2])};
        Arrays.sort(arr2);

        if (arr2[0] + arr2[1] <= arr2[2]) {
            sb.append((arr2[0] + arr2[1]) * 2 - 1);
        } else {
            sb.append(arr2[0] + arr2[1] + arr2[2]);
        }
        br.close();
        bw.write(sb.toString());
        bw.flush();
        bw.close();
    }
}