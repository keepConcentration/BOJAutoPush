import java.io.*;

public class Main {

    static final StringBuilder sb = new StringBuilder();
    static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static final BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    static final StringBuilder[] NUMBERS = new StringBuilder[]{
            new StringBuilder("0000\n0  0\n0  0\n0  0\n0000\n"),
            new StringBuilder("   1\n   1\n   1\n   1\n   1\n"),
            new StringBuilder("2222\n   2\n2222\n2\n2222\n"),
            new StringBuilder("3333\n   3\n3333\n   3\n3333\n"),
            new StringBuilder("4  4\n4  4\n4444\n   4\n   4\n"),
            new StringBuilder("5555\n5\n5555\n   5\n5555\n"),
            new StringBuilder("6666\n6\n6666\n6  6\n6666\n"),
            new StringBuilder("7777\n   7\n   7\n   7\n   7\n"),
            new StringBuilder("8888\n8  8\n8888\n8  8\n8888\n"),
            new StringBuilder("9999\n9  9\n9999\n   9\n   9\n"),
    };

    public static void main(String[] args) throws IOException {

        String[] strArr = br.readLine().split("");

        for (int i = 0; i < strArr.length; ++i) {
            int in = Integer.parseInt(strArr[i]);
            sb.append(NUMBERS[in]).append("\n");
        }

        bw.write(sb.toString());
        bw.flush();
        bw.close();
        br.close();
    }
}
