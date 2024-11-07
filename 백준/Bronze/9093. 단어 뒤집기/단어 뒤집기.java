import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

interface Main {
    static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int cnt = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        
        // sb.reverse()
        for (int i = 0; i < cnt; ++i) {
            String origin = br.readLine();
            String reverse = "";
            
            String[] wordArr = origin.split(" ");
            
            for (int j = 0; j < wordArr.length; ++j) {
                for (int k = wordArr[j].length() - 1; k > -1; --k) {
                    reverse += wordArr[j].charAt(k);
                }
                if (j != wordArr.length) {
                    reverse += " ";
                }
            }
            sb.append(reverse + "\n");
        }
        
        System.out.print(sb.toString());
    }
}