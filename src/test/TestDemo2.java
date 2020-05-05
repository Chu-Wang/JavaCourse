package test;

import com.sun.xml.internal.bind.unmarshaller.DOMScanner;

import java.util.Scanner;

/**
 * @author WangMingMing
 * @creat 2020-04-14 15:18
 */
public class TestDemo2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("输入一个数字");
        int num = input.nextInt();
        switch (num){
            case 0:
                System.out.println("输入为0");
                break;
            case 1:
                if(true){
                    System.out.println("可以加if");
                }
                System.out.println("不知道的时候可以自己测试一下");
                break;
            default:
                System.out.println("输入的数字不是0或者1");
                break;
        }
    }
}
