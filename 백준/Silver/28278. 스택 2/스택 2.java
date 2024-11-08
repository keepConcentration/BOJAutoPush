import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();
        int N = Integer.parseInt(br.readLine());

        Integer[] stack = new Integer[1_000_000];
        int lastIndex = -1;
        while (N-- > 0) {
            String[] in = br.readLine().split(" ");
            String order = in[0];
            if ("1".equals(order)) {
                stack[++lastIndex] = Integer.parseInt(in[1]);
            } else if ("2".equals(order)) {
                if (lastIndex == -1) {
                    sb.append("-1\n");
                } else {
                    sb.append(stack[lastIndex]).append("\n");
                    stack[lastIndex] = null;
                    lastIndex--;
                }
            } else if ("3".equals(order)) {
                sb.append(lastIndex + 1).append("\n");
            } else if ("4".equals(order)) {
                sb.append(lastIndex == -1 ? 1 : 0).append("\n");
            } else {
                if (lastIndex == -1) {
                    sb.append("-1\n");
                } else {
                    sb.append(stack[lastIndex]).append("\n");
                }
            }
        }

        bw.write(sb.toString());
        bw.flush();
        bw.close();
    }
}
