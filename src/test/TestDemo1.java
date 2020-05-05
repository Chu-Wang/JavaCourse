package test;

import java.util.Scanner;

/**
 * @author WangMingMing
 * @creat 2020-04-01 20:03
 */
public class TestDemo1 {
    public static void main(String[] args) {
        System.out.println('I' < '8');
        Scanner scanner = new Scanner(System.in);
        while(scanner.hasNext()){
            StringBuilder s = new StringBuilder(scanner.nextLine());
            s.reverse();

        }
    }
}
