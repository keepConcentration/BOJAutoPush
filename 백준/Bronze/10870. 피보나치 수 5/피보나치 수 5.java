import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

class Main {
    public static void main(String[] args) throws IOException {
        System.out.print(solution(Integer.parseInt(new BufferedReader(new InputStreamReader(System.in)).readLine())));
    }
    public static int solution(int param) {
        if (param == 0) {
            return 0;
        } else if (param == 1) {
            return 1;
        } else {
            return solution(param - 1) + solution(param - 2);
        }
    }
}