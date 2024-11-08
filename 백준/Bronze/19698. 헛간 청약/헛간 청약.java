import java.util.Scanner;

interface Main {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int w = sc.nextInt();
        int h = sc.nextInt();
        int l = sc.nextInt();
        
        int result = 0;
        
        int cow = (int)(w / l) * (int)(h / l);
        if (n < cow) {
            result = n;
        } else {
            result = cow;
        }
        System.out.println(result);
        
    }
}