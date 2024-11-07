import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

interface Main {
    static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int cnt = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();

        l:for (int i = 0; i < cnt; ++i) {
            String parenthesisStr = br.readLine();
            int computeParenthesis = 0;
            for (int j = 0; j < parenthesisStr.length(); ++j) {
                String charac = String.valueOf(parenthesisStr.charAt(j));
                computeParenthesis += "(".equals(charac) ? 1 : -1;
                
                if (computeParenthesis < 0) {
                    sb.append("NO\n");
                    continue l;
                }
            }
            
            sb.append((computeParenthesis == 0 ? "YES" : "NO") + "\n");
        }
        
        System.out.print(sb.toString());
    }
}