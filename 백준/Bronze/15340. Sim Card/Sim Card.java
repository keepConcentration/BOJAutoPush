import java.io.*;

class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String in = "";
        while (!(in = br.readLine()).equals("0 0")) {
            int tel = Integer.parseInt(in.split(" ")[0]);
            int data = Integer.parseInt(in.split(" ")[1]);

            int parsTelAmount = parsTelAmount(tel, data);
            int parsCellAmount = parsCellAmount(tel, data);
            int parsPhoneAmount = parsPhoneAmount(tel, data);

            int minAmount = 0;

            if (parsTelAmount < parsCellAmount) {
                minAmount = parsTelAmount;
            } else {
                minAmount = parsCellAmount;
            }

            if (minAmount > parsPhoneAmount) {
                minAmount = parsPhoneAmount;
            }
            bw.write(String.valueOf(minAmount));
            bw.write("\n");
        }
        br.close();
        bw.flush();
        bw.close();
    }

    private static int parsTelAmount(int tel, int data) {
        return tel * 30 + data * 40;
    }

    private static int parsCellAmount(int tel, int data) {
        return tel * 35 + data * 30;
    }

    private static int parsPhoneAmount(int tel, int data) {
        return tel * 40 + data * 20;
    }
}