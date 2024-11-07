import java.io.*;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();
        String str = br.readLine();

        int[] arr = new int[26];

        for (int i = 0; i < str.length(); ++i) {
            char cha = str.charAt(i);
            arr[(int) cha - 97]++;
        }

        for (int i = 0; i < arr.length; ++i) {
            sb.append(arr[i]).append(" ");
        }

        br.close();
        bw.write(sb.toString());
        bw.flush();
        bw.close();
    }
}