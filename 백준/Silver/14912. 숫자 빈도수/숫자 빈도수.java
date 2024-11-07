import java.io.*;

class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();
        String[] arr = br.readLine().split(" ");

        int n = Integer.parseInt(arr[0]);
        String d = arr[1];

        int result = 0;
        for (int i = 1; i <= n; ++i) {
            String[] iArr = ("" + i).split("");
            for (int j = 0; j < iArr.length; ++j) {
                if (d.equals(iArr[j])) {
                    result++;
                }
            }
        }
        sb.append(result);
        br.close();
        bw.write(sb.toString());
        bw.flush();
        bw.close();
    }
}