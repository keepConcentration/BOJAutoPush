import java.util.*;interface Main{static void main(String[]z){Scanner s=new Scanner(System.in);int a=s.nextInt(),b=s.nextInt(),c=s.nextInt(),d=s.nextInt();System.out.print(a<b&b<c&c<d?"Fish Rising":d<c&c<b&b<a?"Fish Diving":a==b&b==c&c==d?"Fish At Constant Depth":"No Fish");}}