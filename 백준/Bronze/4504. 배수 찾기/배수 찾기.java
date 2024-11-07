import java.util.Scanner;

interface Main {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int target = sc.nextInt();
        String result = "";
        int read = 0;
        while ((read = sc.nextInt()) != 0) {
            if (read % target != 0) {
                result += read + " is NOT a multiple of " + target + ".\n";
            } else {
                result += read + " is a multiple of " + target + ".\n";
            }
        }
        System.out.print(result);
    }
}