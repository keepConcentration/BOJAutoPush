import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();
        String result = "";
        if(input == 1) {
            result = "1/1";
            System.out.print(result);
        } else {
            int minNum = 2;
            int maxLength = 2;
            int maxNum = 3;
            int rightNumber = 1;
            int leftNumber = 1;
            
            boolean leftDownRightup = true;
            
            while(true) {
                if(input >= minNum && input <= maxNum) {
                    break;
                }
                maxLength++;
                minNum = maxNum + 1;
                maxNum += maxLength;
            }
            if(maxLength % 2 == 0) {
                leftDownRightup = true;
                rightNumber = maxLength;
            } else {
                leftDownRightup = false;
                leftNumber = maxLength;
            }
            for(int i = minNum; i <= maxNum; i++) {
                if(i == input) {
                    break;
                }
                if(leftDownRightup == false) {
                    leftNumber -= 1;
                    rightNumber += 1;
                } else {
                    leftNumber += 1;
                    rightNumber -= 1;
                }
            }
            result = leftNumber + "/" + rightNumber;
            System.out.print(result);
        }
    }
} 