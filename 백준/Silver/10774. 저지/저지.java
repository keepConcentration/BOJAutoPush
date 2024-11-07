import java.io.*;

class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();
        int J = Integer.parseInt(br.readLine());
        int A = Integer.parseInt(br.readLine());

        String[] j = new String[J + 1];
        for (int i = 1; i < j.length; ++i) {
            j[i] = br.readLine();
        }
        int result = 0;
        String[] requestedSizeAndNumber = new String[A + 1];
        for (int i = 1; i < requestedSizeAndNumber.length; ++i) {
            requestedSizeAndNumber[i] = br.readLine();

            String size = requestedSizeAndNumber[i].substring(0, 1);
            int number = Integer.parseInt(requestedSizeAndNumber[i].substring(2));
            if (j[number] == null) {
                continue;
            }
            if (size.equals("S") ||
                    size.equals("M") && (j[number].equals("M") || j[number].equals("L")) ||
                    size.equals("L") && j[number].equals("L")) {
                j[number] = null;
                result++;
            }
        }
        sb.append(result);

        bw.write(sb.toString());
        bw.flush();
        bw.close();
    }
}