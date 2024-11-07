import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String result = "";
        for (int i = 0; i < 3; ++i) {
            String param = br.readLine();
            String[] arr = param.split(" ");
            int cnt = 0;
            for (int j = 0; j < 4; ++j) {
                if (arr[j].equals("0")) {
                    cnt++;
                }
            }
            switch (cnt) {
                case 0:
                    result += "E";
                    break;
                case 1: 
                    result += "A";
                    break;
                case 2:
                    result += "B";
                    break;
                case 3:
                    result += "C";
                    break;
                case 4:
                    result += "D";
                    break;
            }
            result += "\n";
        }
        System.out.print(result);
    }
}