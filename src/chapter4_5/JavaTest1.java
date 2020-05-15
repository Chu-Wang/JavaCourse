package chapter4_5;

import java.util.Scanner;

/**
 * @author WangMingMing
 * @creat 2020-03-03 14:05
 */
public class JavaTest1 {
    public static void main(String[] args) {
        int[] count = new int[26];//用来保存每个字母出现次数
        System.out.print("请输入一个字符串： ");
        Scanner input = new Scanner(System.in);
        String str = input.nextLine();
        String s = str.toUpperCase();
        for(int i = 0; i < s.length(); i++){
            count[(int)(s.charAt(i) - 'A')]++;
        }
        System.out.println("字母出现次数为（不区分大小写）：");
        for(int i = 0; i < count.length; i++){
            if(count[i] != 0){
                System.out.println((char)('A' + i) + "出现" + count[i] + "次");
            }
        }
    }
}


