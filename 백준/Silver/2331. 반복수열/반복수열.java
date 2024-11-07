import java.io.*;

class Main {

    static int[] visitedArr;

    static int pow;

    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        visitedArr = new int[236197];

        String[] arr = br.readLine().split(" ");
        int startNum = Integer.parseInt(arr[0]);
        pow = Integer.parseInt(arr[1]);

        sb.append(recursion(startNum, 0) - 1).append("\n");
        br.close();
        bw.write(sb.toString());
        bw.flush();
        bw.close();
    }

    public static int recursion(int n, int count) {
        if (visitedArr[n] != 0) {
            return visitedArr[n];
        }
        count++;
        visitedArr[n] = count;
        String s = String.valueOf(n);

        int nextN = 0;
        for (int i = 0; i < s.length(); ++i) {
            int temp = Integer.parseInt(String.valueOf(s.charAt(i)));
            nextN += Math.pow(temp, pow);
        }
        return recursion(nextN, count);
    }
}