import java.io.*;

class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int person = Integer.parseInt(br.readLine());
        String[] size = br.readLine().split(" ");
        String[] set = br.readLine().split(" ");
        int shirtsSet = Integer.parseInt(set[0]);
        int penSet = Integer.parseInt(set[1]);
        br.close();

        int result1 = 0;

        for (int i = 0; i < size.length; ++i) {
            int shirtsCount = Integer.parseInt(size[i]);
            result1 += shirtsCount / shirtsSet;
            if (shirtsCount % shirtsSet > 0) {
                result1++;
            }
        }

        int result2 = person / penSet;
        int result3 = person % penSet;

        bw.write(result1 + "\n");
        bw.write(result2 + " " + result3);
        bw.flush();
        bw.close();
    }
}