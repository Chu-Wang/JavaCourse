package chapter11_13.p4;

/**
 * @author WangMingMing
 * @creat 2020-03-17 9:20
 */
public class Test {
    public static void main(String[] args) {
        Component computer = ComponentFactory.creat();
        System.out.println(computer);
        System.out.println("id: " + computer.getId() + ", name: "+ computer.getName() +
                ", price: " + computer.getPrice());
        Iterator it = computer.iterator();
        while(it.hasNext()){
            Component c = it.next();
            System.out.println("id: " + c.getId() + ", name: " + c.getName() + ", price: " + c.getPrice());
        }

    }
}
