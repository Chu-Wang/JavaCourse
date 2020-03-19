package test;

/**
 * @author WangMingMing
 * @creat 2020-03-16 21:29
 */
public class Test5 {
    public static void main(String... args){
        A o = new C();
        o.m1();			//①
        o.m2();			//②
        ((B)o).m1();		//③
        ((A)(B)o).m1();		//④
        ((A)(B)o).m2();		//⑤
    }
}

class A{
    public static void m1(){  System.out.println("A's m1"); }
    public void m2(){ System.out.println("A's m2"); }
}

class B extends A{
    public static void m1(){  System.out.println("B's m1"); }
    public void m2(){ System.out.println("B's m2"); }
}

class C extends B{
    public static void m1(){  System.out.println("C's m1"); }
    public void m2(){ System.out.println("C's m2"); }
}
