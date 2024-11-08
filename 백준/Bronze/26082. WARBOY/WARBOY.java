import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();
        String[] in = br.readLine().split(" ");
        
        sb.append(Integer.parseInt(in[1]) / Integer.parseInt(in[0]) * Integer.parseInt(in[2]) * 3);
        
        bw.write(sb.toString());
        bw.flush();
        bw.close();
    }
}