import java.util.Scanner;

interface Main {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int result = 0;
        int train = 0;
        for (int i = 0; i < 4; ++i) {
            train -= sc.nextInt();
            train += sc.nextInt();
            if (result < train) {
                result = train;
            }
        }
        System.out.println(result);
    }
}