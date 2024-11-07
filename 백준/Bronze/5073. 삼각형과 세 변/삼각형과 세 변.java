import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

interface Main {
    static void main(String[] b) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();

        String in;

        while (!(in = br.readLine()).equals("0 0 0")) {
            String[] arr = in.split(" ");
            int x = Integer.parseInt(arr[0]),
                    y = Integer.parseInt(arr[1]),
                    z = Integer.parseInt(arr[2]);

            if (x == y && y == z) {
                sb.append("Equilateral\n");
                continue;
            }
            int max = Math.max(x, Math.max(y, z));
            int min = Math.min(x, Math.min(y, z));
            int middle;
            if (x < y) {
                if (y < z) {
                    middle = y;
                } else {
                    middle = z;
                }
            } else if (x < z) {
                if (z < y) {
                    middle = z;
                } else {
                    middle = y;
                }
            } else {
                // y <= x || y <= z
                if (x < z) {
                    middle = x;
                } else {
                    middle = z;
                }
            }
            if (min + middle <= max) {
                sb.append("Invalid\n");
                continue;
            }
            if (x == y || x == z || y == z) {
                sb.append("Isosceles\n");
                continue;
            }
            sb.append("Scalene\n");
        }
        br.close();
        bw.write(sb.toString());
        bw.flush();
        bw.close();
    }
}