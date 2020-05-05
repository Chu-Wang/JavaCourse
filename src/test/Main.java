package test;

import com.sun.org.apache.xpath.internal.operations.Bool;


import java.util.Arrays;
import java.util.Scanner;

/**
 * @author WangMingMing
 * @creat 2020-04-03 13:26
 * 先创建一个数组，表示奇数和偶数
 * 然后录入数据，将有该数字的置为0,同时再用两个数组key1,key2保存被砍掉的树的编号,以及每个数组中元素的数目
 * 之后计算key1中相邻元素的差值，key1中第一个元素和0的差值，50和key1中最后一个元素的差值，，，对key2同理，保存插值，和对应的编号
 * 之后将会得出最大的差值，，
 *
 */
public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] number = new int[101];//100棵树
        int[] key1 = new int[50];//用来保存砍掉的编号
        int[] key2 = new int[50];
        for(int i = 0; i < number.length; i++){
            number[i] = 1;
        }
        int N = scanner.nextInt();
        int count1 = 0;//记录被砍掉的树的数目
        int count2 = 0;
        while(N-- > 0){
            int num = scanner.nextInt();
            if(num % 2 == 0){
                key1[count1] = num;
                count1++;
            }else{
                key2[count2] = num;
                count2++;
            }
            number[num] = 0;
        }
        Arrays.sort(key1);

        if(count1 == 0){
            System.out.println("1 50");
            return;
        }
        int max = 0;
        int currentIndex = -1;
        for(int i = 1; i < count1; i++){
            int temp = key1[i] - key1[i - 1];
            if(temp > max){
                max = temp;
                currentIndex = key1[i - 1];
            }
        }
        int num1 = key1[0] - 0;
        int num2 = 50 - key1[count1 - 1];
        if(num1 > max){
            max = num1;
            currentIndex = 1;
        }
        if(num2 > max){
            max = num2;
            currentIndex = key1[count1];
        }


        Arrays.sort(key2);
        if(count2 == 0){
            System.out.println("2 50");
            return;
        }
        int max2 = 0;
        int currentIndex2 = -1;
        for(int i = 1; i < count2; i++){
            int temp = key2[i] - key2[i - 1];
            if(temp > max2){
                max2 = temp;
                currentIndex2 = key2[i - 1];
            }
        }
        int num1_2 = key2[0] - 0;
        int num2_2 = 50 - key2[count2 - 1];
        if(num1_2 > max2){
            max2 = num1_2;
            currentIndex2 = 2;
        }
        if(num2_2 > max){
            max = num2_2;
            currentIndex2 = key2[count2];
        }

        if(max >= max2){
            System.out.println(currentIndex + " " + max);
        }else{
            System.out.println(currentIndex2 + " " + max2);
        }


    }
}
