import java.io.*;

class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();
        String str = br.readLine();
        br.close();

        for (int i = 0; i < str.length(); ++i) {
            sb.append(extractChosung(String.format("%04x", str.codePointAt(i))));
        }

        bw.write(sb.toString());
        bw.flush();
        bw.close();
    }

    private static String extractChosung(String format) {
        int code = Integer.parseInt(format, 16);
        if (code < 0XAE4C) {
            return "ㄱ";
        }
        if (code < 0XB098) {
            return "ㄲ";
        }
        if (code < 0XB2E4) {
            return "ㄴ";
        }
        if (code < 0XB530) {
            return "ㄷ";
        }
        if (code < 0XB77C) {
            return "ㄸ";
        }
        if (code < 0XB9C8) {
            return "ㄹ";
        }
        if (code < 0XBC14) {
            return "ㅁ";
        }
        if (code < 0XBE60) {
            return "ㅂ";
        }
        if (code < 0XC0AC) {
            return "ㅃ";
        }
        if (code < 0XC2F8) {
            return "ㅅ";
        }
        if (code < 0XC544) {
            return "ㅆ";
        }
        if (code < 0XC790) {
            return "ㅇ";
        }
        if (code < 0XC9DC) {
            return "ㅈ";
        }
        if (code < 0XCC28) {
            return "ㅉ";
        }
        if (code < 0XCE74) {
            return "ㅊ";
        }
        if (code < 0XD0C0) {
            return "ㅋ";
        }
        if (code < 0XD30C) {
            return "ㅌ";
        }
        if (code < 0XD558) {
            return "ㅍ";
        }
        return "ㅎ";
    }
}