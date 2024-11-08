import java.io.*;

class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int in = Integer.parseInt(br.readLine());
        br.close();

        if (in >= 620 && in <= 780) {
            bw.write("Red");
        } else if (in >= 590 && in < 620) {
            bw.write("Orange");
        } else if (in >= 570 && in < 590) {
            bw.write("Yellow");
        } else if (in >= 495 && in < 570) {
            bw.write("Green");
        } else if (in >= 450 && in < 495) {
            bw.write("Blue");
        } else if (in >= 425 && in < 450) {
            bw.write("Indigo");
        } else {
            bw.write("Violet");
        }

        bw.flush();
        bw.close();
    }
}