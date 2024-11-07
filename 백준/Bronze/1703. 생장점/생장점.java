import java.util.Scanner;

interface Main {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String result = "";
        int nextInt = 0;
        while ((nextInt = sc.nextInt()) != 0) {
            long res = 1;
            for (int i = 0; i < nextInt*2; ++i) {
                if (i % 2 == 0) {
                    res *= sc.nextLong();
                } else {
                    res -= sc.nextLong();
                }
            }
            result += res + "\n";
        }
        System.out.println(result);
    }
}