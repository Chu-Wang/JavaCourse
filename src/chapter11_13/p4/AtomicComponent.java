package chapter11_13.p4;

/**
 * @author WangMingMing
 * @creat 2020-03-17 8:46
 */
public class AtomicComponent extends Component{
    public AtomicComponent() {
    }

    public AtomicComponent(int id, String name, double price) {
        super(id, name, price);
    }
    public void add(Component component) throws UnsupportedOperationException{
        throw new UnsupportedOperationException();
    }
    public double calcPrice(){
        return this.getPrice();
    }
    public Iterator iterator(){
        return new NullIterator();
    }
    public void remove(Component component) throws UnsupportedOperationException{
        throw new UnsupportedOperationException();
    }

}
