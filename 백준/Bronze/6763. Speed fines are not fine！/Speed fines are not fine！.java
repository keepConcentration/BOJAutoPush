import java.util.Scanner;

interface Main{
    static void main(String[]z){
        //"You are speeding and your fine is $500."
        //"Congratulations, you are within the speed limit!"
        // 1 ~20 100
        // 21~30 270
        // 31~   500
        Scanner s=new Scanner(System.in);
        int a=s.nextInt(),b=s.nextInt()-a;
        String str = b<1?"Congratulations, you are within the speed limit!":"You are speeding and your fine is ";
        str += b>30?"$500.":b>20?"$270.":b>0?"$100.":"";
        System.out.println(str);
    }
}