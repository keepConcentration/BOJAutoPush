import java.util.Scanner;
interface Main {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int loop = sc.nextInt();
        int cute = 0;
        int notCute = 0;
        for (int i = 0;i < loop; ++i) {
            if (sc.nextInt() == 0) {
                notCute++;
            } else {
                cute++;
            }
        }
        
        if (notCute > cute) {
            System.out.println("Junhee is not cute!");
        } else {
            System.out.println("Junhee is cute!");
        }
    }
}