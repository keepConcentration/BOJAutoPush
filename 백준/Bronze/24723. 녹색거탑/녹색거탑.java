import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();
        int in = Integer.parseInt(br.readLine());
        String result = "2";
        if (in == 2) {
            result = "4";
        } else if (in == 3) {
            result = "8";
        } else if (in == 4) {
            result = "16";
        } else if (in == 5) {
            result = "32";
        }
        
        bw.write(result);
        bw.flush();
        bw.close();
    }
}