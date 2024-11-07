import java.io.*;

class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();
        String[] arr = br.readLine().split(" ");
        int N = Integer.parseInt(arr[0]);
        int P = Integer.parseInt(arr[1]);

        Integer[] x = new Integer[P + 1];

        int loopCount = 0;
        int temp = N;
        x[0] = temp;
        l:for (int i = 1; i <= P; ++i) {
            int nnp = (x[i - 1] * N) % P;
            for (int j = 0; j < i; ++j) {
                if (nnp == x[j]) {
                    loopCount = i - j;
                    break l;
                }
            }
            x[i] = nnp;
        }

        br.close();
        sb.append(loopCount);
        bw.write(sb.toString());
        bw.flush();
        bw.close();
    }
}