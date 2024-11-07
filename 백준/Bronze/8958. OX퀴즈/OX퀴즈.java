import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int loop = sc.nextInt();
        String result = "";
        for (int i = 0; i < loop; ++i) {
            String input = sc.next();
            int score= 0,
                subScore= 0;
            for (int j = 0; j < input.length(); ++j) {
                if (input.substring(j, j + 1).equals("O")) {
                    score += ++subScore;
                } else {
                    subScore = 0;
                }
            }
            result += score+ "\n";
        }
        System.out.print(result);
    }
}