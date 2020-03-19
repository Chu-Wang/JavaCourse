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
            switch(s.charAt(i)){
                case 'A':
                    count[0]++;
                    break;
                case 'B':
                    count[1]++;
                    break;
                case 'C':
                    count[2]++;
                    break;
                case 'D':
                    count[3]++;
                    break;
                case 'E':
                    count[4]++;
                    break;
                case 'F':
                    count[5]++;
                    break;
                case 'G':
                    count[6]++;
                    break;
                case 'H':
                    count[7]++;
                    break;
                case 'I':
                    count[8]++;
                    break;
                case 'J':
                    count[9]++;
                    break;
                case 'K':
                    count[10]++;
                    break;
                case 'L':
                    count[11]++;
                    break;
                case 'M':
                    count[12]++;
                    break;
                case 'N':
                    count[13]++;
                    break;
                case 'O':
                    count[14]++;
                    break;
                case 'P':
                    count[15]++;
                    break;
                case 'Q':
                    count[16]++;
                    break;
                case 'R':
                    count[17]++;
                    break;
                case 'S':
                    count[18]++;
                    break;
                case 'T':
                    count[19]++;
                    break;
                case 'U':
                    count[20]++;
                    break;
                case 'V':
                    count[21]++;
                    break;
                case 'W':
                    count[22]++;
                    break;
                case 'X':
                    count[23]++;
                    break;
                case 'Y':
                    count[24]++;
                    break;
                case 'Z':
                    count[25]++;
                    break;
            }
        }

        System.out.println("字母出现次数为（不区分大小写）：");
        for(int i = 0; i < count.length; i++){
            if(count[i] != 0){
                System.out.println((char)('A' + i) + "出现" + count[i] + "次");
            }
        }
    }
}


