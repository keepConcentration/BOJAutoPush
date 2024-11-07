import java.util.*;

interface Main {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int A = sc.nextInt(),
        B = sc.nextInt(),
        C = B + sc.nextInt(),
        D = A + sc.nextInt();System.out.print(C<D?C:D);}}