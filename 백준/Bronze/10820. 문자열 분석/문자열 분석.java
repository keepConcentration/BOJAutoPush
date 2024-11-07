import java.io.*;

class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();

        String str;
        while ((str = br.readLine()) != null) {
            int lower = 0;
            int upper = 0;
            int number = 0;
            int space = 0;
            for (int i = 0; i < str.length(); ++i) {
                char cha = str.charAt(i);

                if (48 <= cha && cha <= 57) {
                    number++;
                } else if (cha == 32) {
                    space++;
                } else if (97 <= cha && cha <= 122) {
                    lower++;
                } else {
                    upper++;
                }
            }
            sb.append(lower).append(" ")
                    .append(upper).append(" ")
                    .append(number).append(" ")
                    .append(space).append("\n");
        }

        br.close();
        bw.write(sb.toString());
        bw.flush();
        bw.close();
    }
}