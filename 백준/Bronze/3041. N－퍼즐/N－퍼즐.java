import java.io.*;

class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();

        String[][] collectArr = {{"A", "B", "C", "D"}, {"E", "F", "G", "H"}, {"I", "J", "K", "L"}, {"M", "N", "O", "."}};
        String[][] arr = new String[4][4];
        arr[0] = br.readLine().split("");
        arr[1] = br.readLine().split("");
        arr[2] = br.readLine().split("");
        arr[3] = br.readLine().split("");

        int result = 0;
        for (int i = 0; i < 4; ++i) {
            for (int j = 0; j < 4; ++j) {
                if (!arr[i][j].equals(collectArr[i][j]) && !arr[i][j].equals(".")) {
                    l:for (int k = 0; i < 4; ++k) {
                        for (int m = 0; m < 4; ++m) {
                            if (arr[i][j].equals(collectArr[k][m])) {
                                result += Math.abs(k - i) + Math.abs(j - m);
                                break l;
                            }
                        }
                    }
                }
            }
        }
        sb.append(result);
        bw.write(sb.toString());
        bw.flush();
        bw.close();
    }
}