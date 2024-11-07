import java.io.*;

class Main {
    public static void main(String[] args) throws Exception {
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        bw.write("  ___  ___  ___\n" +
                "  | |__| |__| |\n" +
                "  |           |\n" +
                "   \\_________/\n" +
                "    \\_______/\n" +
                "     |     |\n" +
                "     |     |\n" +
                "     |     |\n" +
                "     |     |\n" +
                "     |_____|\n" +
                "  __/       \\__\n" +
                " /             \\\n" +
                "/_______________\\");
        bw.flush();
        bw.close();
    }
}