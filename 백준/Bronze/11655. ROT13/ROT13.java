import java.io.*;

class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();

        String str = br.readLine();
        for (int i = 0; i < str.length(); ++i) {
            char cha = str.charAt(i);

            if (97 <= cha && cha <= 122) {
                cha += 13;
                if (cha > 122) {
                    cha = (char) (cha - 122 + 96);
                }
            } else if (65 <= cha && cha <= 90){
                cha += 13;
                if (cha > 90) {
                    cha = (char) (cha - 90 + 64);
                }
            }
            sb.append(cha);
        }

        br.close();
        bw.write(sb.toString());
        bw.flush();
        bw.close();
    }
}