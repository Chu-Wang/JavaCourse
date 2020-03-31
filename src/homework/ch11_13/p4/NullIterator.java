package homework.ch11_13.p4;

/**
 * @author WangMingMing
 * @creat 2020-03-17 8:57
 */
public class NullIterator implements Iterator{
    public NullIterator() {
    }
    @Override
    public boolean hasNext(){
        return false;
    }
    @Override
    public Component next(){
        return null;
    }
}
