import java.io.*;

class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String a = "";
        String blank = "";

        int count = Integer.parseInt(br.readLine());
        for (int i = 0; i < count; ++i) {
            a += "@";
            blank += " ";
        }

        String firstLine = a + a + a + blank + a;
        for (int i = 0; i < count; ++i) {
            System.out.println(firstLine);
        }

        String middleLine = a + blank + a + blank + a;
        for (int i = 0; i < count * 3; ++i) {
            System.out.println(middleLine);
        }

        String lastLine = a + blank + a + a + a;
        for (int i = 0; i < count; ++i) {
            System.out.println(lastLine);
        }
    }
}