import java.util.Scanner;

interface Main {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int loop = sc.nextInt();
        int result = sc.nextInt();
        int car = result;
        for (int i = 0; i < loop; ++i) {
            car += sc.nextInt();
            
            car -= sc.nextInt();
            if (result < car) {
                result = car;
            }
            if (car < 0) {
                result = 0;
                break;
            }
            
        }
        System.out.println(result);
    }
}