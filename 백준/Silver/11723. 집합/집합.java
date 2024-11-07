import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;
import static java.lang.Integer.parseInt;

interface Main {
    static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuffer sb = new StringBuffer();
        int M = parseInt(br.readLine());
        
        int bitset = 0;
        
        while (M-- > 0) {
            String[] in = br.readLine().split(" ");
            int num;
            switch (in[0]) {
                case "add" :
                    num = parseInt(in[1]) - 1;
                    bitset = bitset | (1 << num);
                    break;
                case "remove" :
                    num = parseInt(in[1]) - 1;
                    bitset = bitset & ~(1 << num);
                    break;
                case "check" :
                    num = parseInt(in[1]) - 1;
                    if ((bitset & (1 << num)) != 0) {
                        sb.append("1\n");
                        break;
                    }
                    sb.append("0\n");
                    break;
                case "toggle" :
                    num = parseInt(in[1]) - 1;
                    bitset = bitset ^ (1 << num);
                    break;
                case "all" :
                    bitset = bitset | (~0);
                    break;
                case "empty" :
                    bitset = bitset & 0;
                    break;
            }
        }
        
        bw.write(sb.toString());
        bw.flush();
        bw.close();
        br.close();
    }
}