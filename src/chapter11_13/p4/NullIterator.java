package chapter11_13.p4;

import chapter11_13.p4.Component;
import chapter11_13.p4.Iterator;

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
