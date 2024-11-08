import java.io.*;

class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();

        String[] arr = br.readLine().split(" ");
        int H = Integer.parseInt(arr[0]);
        int I = Integer.parseInt(arr[1]);
        int A = Integer.parseInt(arr[2]);
        int R = Integer.parseInt(arr[3]);
        int C = Integer.parseInt(arr[4]);
        
        int one = H * I;
        int two = A * R * C;
        sb.append(one - two);

        bw.write(sb.toString());
        bw.flush();
        bw.close();
    }
}