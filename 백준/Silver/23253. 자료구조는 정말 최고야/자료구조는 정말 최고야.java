import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;

interface Main {
    static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuffer sb = new StringBuffer();
        
        String[] in = br.readLine().split(" ");
        int totCnt = Integer.parseInt(in[0]);
        int dummyCnt = Integer.parseInt(in[1]);
        
        String result = "Yes";
        
        l:for (int i = 0; i < dummyCnt; ++i) {
            int dummyBookCnt = Integer.parseInt(br.readLine());
            
            String[] bookArr = br.readLine().split(" ");
            int sortCompute = 200001;
            for (int j = 0; j < dummyBookCnt; ++j) {
                if (sortCompute < Integer.parseInt(bookArr[j])) {
                    result = "No";
                    break l;
                }
                sortCompute = Integer.parseInt(bookArr[j]);
            }
        }
        
        sb.append(result);
        
        bw.write(sb.toString());
        bw.flush();
        bw.close();
        br.close();
    }
}