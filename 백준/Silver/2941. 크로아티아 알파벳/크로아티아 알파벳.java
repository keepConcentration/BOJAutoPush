import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

class Main {
    public static void main(String[] args) throws Exception {
        String param = new BufferedReader(new InputStreamReader(System.in)).readLine();
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String[] list = {"c=", "c-", "dz=", "d-", "lj", "nj", "s=", "z="};
        for (String target : list) {
            param = param.replaceAll(target, "1");
        }
        bw.write(String.valueOf(param.length()));
        bw.flush();
    }
}