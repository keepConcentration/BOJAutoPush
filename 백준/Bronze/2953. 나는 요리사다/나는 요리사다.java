import java.util.Scanner;

interface Main {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = 0;
        int score = 0;
        for (int i = 1; i <= 5; ++i) {
            int paramScore = sc.nextInt();
            paramScore += sc.nextInt();
            paramScore += sc.nextInt();
            paramScore += sc.nextInt();
            if (paramScore > score) {
                score = paramScore;
                num = i;
            }
        }
        System.out.println(num + " " + score);
    }
}