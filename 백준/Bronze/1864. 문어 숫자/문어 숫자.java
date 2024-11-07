import java.io.BufferedReader;
import java.io.InputStreamReader;

interface Main {
    static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String octo = "";
        String resultStr = "";
        while (!(octo = br.readLine()).equals("#")) {
                   
            int result = 0;
            for (int i = 0; i < octo.length(); ++i) {
                char a = octo.charAt(i);
                int pow = (int)Math.pow(8, octo.length() - 1 - i);
                
                switch (a) {
                    case '/':
                        result += pow * (-1);
                        break;
                    case '\\':
                        result += pow * 1;
                        break;
                    case '(':
                        result += pow * 2;
                        break;
                    case '@':
                        result += pow * 3;
                        break;
                    case '?':
                        result += pow * 4;
                        break;
                    case '>':
                        result += pow * 5;
                        break;
                    case '&':
                        result += pow * 6;
                        break;
                    case '%':
                        result += pow * 7;
                        break;
                }
            }
            resultStr += result + "\n";
        }
        System.out.println(resultStr);
    }
}