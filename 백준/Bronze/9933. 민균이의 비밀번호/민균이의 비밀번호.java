import java.io.*;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(br.readLine());
        String[] arr = new String[N];

        for (int i = 0; i < N; ++i) {
            arr[i] = br.readLine();
        }

        for (int i = 0; i < N; ++i) {
            String str = arr[i];
            String reverseStr = new StringBuilder(str).reverse().toString();
            for (int j = i; j < N; ++j) {
                String strJ = arr[j];
                if (strJ.equals(reverseStr)) {
                    sb.append(str.length()).append(" ").append(str.charAt(str.length() / 2));
                }
            }
        }
        br.close();
        bw.write(sb.toString());
        bw.flush();
        bw.close();
    }
}