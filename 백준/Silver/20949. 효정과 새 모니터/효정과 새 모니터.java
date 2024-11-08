import java.io.*;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();
        int N = Integer.parseInt(br.readLine());

        double[] intArr = new double[N];
        for (int i = 0; i < intArr.length; ++i) {
            String[] str = br.readLine().split(" ");
            int W = Integer.parseInt(str[0]);
            int H = Integer.parseInt(str[1]);


            intArr[i] = Math.sqrt(((int) Math.pow(W, 2) + (int) Math.pow(H, 2))) / 77;
        }

        br.close();

        int[] result = new int[intArr.length];
        for (int i = 0; i < result.length; ++i) {
            result[i] = i + 1;
        }

        for (int i = 0; i < intArr.length - 1; ++i) {
            for (int j = i + 1; j < intArr.length; ++j) {
                if (intArr[i] < intArr[j]) {
                    double temp = intArr[i];
                    intArr[i] = intArr[j];
                    intArr[j] = temp;

                    int temp2 = result[i];
                    result[i] = result[j];
                    result[j] = temp2;
                }
                if (intArr[i] == intArr[j]) {
                    if (result[i] > result[j]) {
                        int temp = result[i];
                        result[i] = result[j];
                        result[j] = temp;
                    }
                }
            }
        }

        for (int i = 0; i < result.length; ++i) {
            sb.append(result[i]).append("\n");
        }

        bw.write(sb.toString());
        bw.flush();
        bw.close();
    }
}