import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String param = br.readLine();
        
        String[] split1 = param.split(" = ");
        double result2 = Double.parseDouble(split1[1]);
        double result = 0;
        if (split1[0].indexOf(" - ") != -1) {
            String[] split2 = split1[0].split(" - ");
            result = Double.parseDouble(split2[0]) - Double.parseDouble(split2[1]);
        }
        if (split1[0].indexOf(" + ") != -1) {
            String[] split2 = split1[0].split(" \\+ ");
            result = Double.parseDouble(split2[0]) + Double.parseDouble(split2[1]);
        }
        if (split1[0].indexOf(" / ") != -1) {
            String[] split2 = split1[0].split(" / ");
            result = Double.parseDouble(split2[0]) / Double.parseDouble(split2[1]);
        }
        if (split1[0].indexOf(" * ") != -1) {
            String[] split2 = split1[0].split(" \\* ");
            result = Double.parseDouble(split2[0]) * Double.parseDouble(split2[1]);
        }
        if (result == result2) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}