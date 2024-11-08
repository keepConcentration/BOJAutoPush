import java.io.*;

class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(br.readLine());

        String S = br.readLine();

        String[] arr = br.readLine().split(" ");

        int D = Integer.parseInt(arr[0]);
        int M = Integer.parseInt(arr[1]);

        arr = S.split("H|Y|U");

        int energy = 0;
        for (int i = 0; i < arr.length; ++i) {
            String s = arr[i];
            int length = s.length();
            if (s.length() == 0) {
                continue;
            }
            if (length * D > (D + M)) {
                energy += D + M;
            } else {
                energy += length * D;
            }
        }
        if (energy == 0) {
            sb.append("Nalmeok\n");
        } else {
            sb.append(energy).append("\n");
        }

        String s = S.replaceAll("[^HYU]", "");
        int h = S.replaceAll("[^H]", "").length();
        int y = S.replaceAll("[^Y]", "").length();
        int u = S.replaceAll("[^U]", "").length();

        int result = Math.min(Math.min(h, y), u);
        if (result == 0) {
            sb.append("I love HanYang University");
        } else {
            sb.append(result);
        }

        br.close();
        bw.write(sb.toString());
        bw.flush();
        bw.close();
    }
}