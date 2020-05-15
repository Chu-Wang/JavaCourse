package chapter2_3;

/**
 * @author WangMingMing
 * @creat 2020-03-10 20:29
 */
public class Exercise02_06 {
    public static void main(String[] args) {
        java.util.Scanner input = new java.util.Scanner(System.in);
        // 读取一个数字
        System.out.print("Enter an integer between 0 and 1000: ");
        int number = input.nextInt();
        int temp = number;
        //第二章没有while
        int sum = 0;
        while(temp != 0){
            int digit = temp % 10;
            sum += digit;
            temp /= 10;
        }
        System.out.println("The sum of all digits in " + number + " is " + sum);
    }
}
