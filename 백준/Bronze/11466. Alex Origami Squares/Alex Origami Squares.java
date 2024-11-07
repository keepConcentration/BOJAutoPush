import java.util.Scanner;

interface Main {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int W = sc.nextInt(),
            H = sc.nextInt(),
            temp = 0;
        double result = 0;
        
        if (W < H) {
            temp = W;
            W = H;
            H = temp;
        }
        
        if (W > H * 3) {
            result = H;
        } else if (W > H * 1.5) {
            result = W / 3.0;
        } else {
            result = H / 2.0;
        }
        System.out.println(result);
    }
}