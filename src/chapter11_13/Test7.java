package chapter11_13;

import java.io.IOException;

/**
 * @author WangMingMing
 * @creat 2020-03-15 17:06
 */

public class Test7 implements I{
    public void m(){

    }
    public static void main(String[] args) {
        I i = new Test7();
    }


}
interface I{
    public abstract void m();
}

