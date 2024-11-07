import java.io.BufferedReader;
import java.io.InputStreamReader;

interface Main {
    static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line = "";
        String resultStr = "";
        while (!(line = br.readLine()).equals("#")) {
            int result = 0;
            for (int i = 0; i < line.length(); ++i) {
                char cha = line.charAt(i);
                l:switch (cha) {
                    case 'a':
                    case 'e':
                    case 'i':
                    case 'o':
                    case 'u':
                    case 'A':
                    case 'E':
                    case 'I':
                    case 'O':
                    case 'U':
                        result++;
                        break l;
                    default:
                        break l;
                }
            }
            resultStr += result + "\n";
        }
        System.out.println(resultStr);
    }
}