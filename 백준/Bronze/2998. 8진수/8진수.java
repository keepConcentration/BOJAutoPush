import java.io.*;

class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();
        String str = br.readLine();

        if (str.length() % 3 != 0) {
            str = "0" + str;
        }
        if (str.length() % 3 != 0) {
            str = "0" + str;
        }
        String result = "";
        for (int i = 0; i < str.length(); i += 3) {
            result += Integer.parseInt(str.substring(i, i + 3), 2);
        }
        sb.append(result);

        br.close();
        bw.write(sb.toString());
        bw.flush();
        bw.close();
    }
}