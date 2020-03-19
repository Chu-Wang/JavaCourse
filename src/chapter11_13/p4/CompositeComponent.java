package chapter11_13.p4;
import chapter11_13.p4.ComponentList;

/**
 * @author WangMingMing
 * @creat 2020-03-17 9:03
 */
public class CompositeComponent extends Component {
    protected ComponentList childs = new ComponentList();

    public CompositeComponent() {
    }

    public CompositeComponent(int id, String name, double price) {
        super(id, name, price);
    }
    public void add(Component component) throws UnsupportedOperationException{
        childs.add(component);
        this.price += component.getPrice();
    }
    public double calcPrice(){
        return this.getPrice();
    }
    public Iterator iterator(){
        return new CompositeIterator(childs);
    }
    public void remove(Component component) throws UnsupportedOperationException{
        childs.remove(component);
        this.price -= component.getPrice();
    }

    @Override
    public String toString() {
        String str = super.toString();
        String str1 = "";
        for(Component c : childs){
            str1 += c.toString();
        }
        return str + "sub-components of " + this.getName() + ": \n" + str1;
    }
}
