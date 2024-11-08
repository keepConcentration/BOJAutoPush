import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String param = br.readLine();
        String result = "";
        if (param.indexOf("I") != -1) {
            result += "E";
        } else {
            result += "I";
        }
        if (param.indexOf("N") != -1) {
            result += "S";
        } else {
            result += "N";
        }
        if (param.indexOf("T") != -1) {
            result += "F";
        } else {
            result += "T";
        }
        if (param.indexOf("J") != -1) {
            result += "P";
        } else {
            result += "J";
        }
        System.out.println(result);
    }
}