package test;

import java.util.Scanner;

/**
 * @author WangMingMing
 * @creat 2020-04-20 20:19
 * 这种题目其实就是考查for循环，外加找规律
 * 这个题目，，可以先打印上半部分，再打印下半部分，这里给的是java版本的，和C版本差不多，只是输入要用scanf
 * 还有，c99标准支持在for循环里面int i = 0; i < 100; i++这种形式，，但是不知道你的codeblocks可不可以
 * 如果不可以，没关系，你就把所有用到的i j k 这种单独写出来就行。所以整体来说你可以轻易的写为c版本的
 * 你在把这个代码转成C版本的过程中应该就明白这个菱形是怎么打印的了
 */
public class TestDemo3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("请输入一个数字: ");
        int n = input.nextInt();//相当于C++中的scanf()
        //先打印上半部分菱形，包括最长的那一行
        for(int i = 0; i < n + 1; i++){
            for(int j = n - i; j > 0; j--){
                System.out.print(" ");
            }
            for(int k = 0; k < 2 * i + 1; k++){
                System.out.print("*");
            }
            System.out.println();
        }

        //打印下半部分菱形
        for(int i = 0; i < n; i++){
            for(int j = i + 1; j > 0; j--){
                System.out.print(" ");
            }
            for(int k = 2 * (n - 1 - i) + 1; k > 0; k--){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}


