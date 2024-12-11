import java.io.*;

import static java.lang.Integer.parseInt;

public class Main {

    static final StringBuilder sb = new StringBuilder();
    static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static final BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String[] args) throws IOException {
        int T = parseInt(br.readLine());

        String[] dice = {null, "Yakk", "Doh", "Seh", "Ghar", "Bang", "Sheesh"};

        for (int i = 1; i <= T; ++i) {
            String str = br.readLine();
            String[] strArr = str.split(" ");
            int num1 = parseInt(strArr[0]);
            int num2 = parseInt(strArr[1]);

            sb.append("Case ").append(i).append(": ");
            if (str.equals("1 1")) {
                sb.append("Habb Yakk\n");
            } else if (str.equals("2 2")) {
                sb.append("Dobara\n");
            } else if (str.equals("3 3")) {
                sb.append("Dousa\n");
            } else if (str.equals("4 4")) {
                sb.append("Dorgy\n");
            } else if (str.equals("5 5")) {
                sb.append("Dabash\n");
            } else if (str.equals("6 6")) {
                sb.append("Dosh\n");
            } else if (str.equals("5 5") || str.equals("5 6") || str.equals("6 5")) {
                sb.append("Sheesh Beesh\n");
            } else {
                int temp1 = num1;
                int temp2 = num2;
                num1 = Math.max(temp1, temp2);
                num2 = Math.min(temp1, temp2);
                sb.append(dice[num1]).append(" ").append(dice[num2]).append("\n");
            }
        }

        bw.write(sb.toString());
        bw.flush();
        bw.close();
        br.close();
    }
}
