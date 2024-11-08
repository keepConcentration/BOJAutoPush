import java.io.*;

class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();
        l:for (int i = 0; i < 15; ++i) {
            String[] arr = br.readLine().split(" ");
            for (int j = 0; j < arr.length; ++j) {
                String str = arr[j];
                if (str.equals("w")) {
                    sb.append("chunbae");
                    break l;
                }
                if (str.equals("b")) {
                    sb.append("nabi");
                    break l;
                }
                if (str.equals("g")) {
                    sb.append("yeongcheol");
                    break l;
                }
            }
        }

        bw.write(sb.toString());
        bw.flush();
        bw.close();
    }
}