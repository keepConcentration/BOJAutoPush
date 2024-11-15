import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();
        
        String result = "";
        String param = "";
        while (!(param = br.readLine()).equals("0 0")) {
            String[] arr = param.split(" ");
            int a = Integer.parseInt(arr[0]);
            int b = Integer.parseInt(arr[1]);
            if (a % b == 0) {
                sb.append("multiple\n");
            } else if (b % a == 0) {
                sb.append("factor\n");
            } else {
                sb.append("neither\n");
            }
        }

        br.close();
        bw.write(sb.toString());
        bw.flush();
        bw.close();
    }
}