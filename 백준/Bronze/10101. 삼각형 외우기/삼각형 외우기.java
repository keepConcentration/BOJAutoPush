import java.util.*;interface Main{static void main(String[]t){Scanner s=new Scanner(System.in);int a=s.nextInt(),b=s.nextInt(),c=s.nextInt();if(a==b&b==c&c==60)System.out.print("Equilateral");else if(a+b+c!=180)System.out.print("Error");else if(a!=b&b!=c&a!=c)System.out.print("Scalene");else System.out.print("Isosceles");}}