package homework.ch11_13.p4;


import java.util.ArrayList;
import java.util.List;

/**
 * @author WangMingMing
 * @creat 2020-03-17 9:00
 */
public class CompositeIterator implements Iterator{
    protected List<Iterator> iterators = new ArrayList<>();

    public CompositeIterator(Iterator iterator) {
        iterators.add(iterator);
    }
    @Override
    public boolean hasNext(){
        if(iterators.isEmpty()){
            return false;
        }
        Iterator iterator = iterators.get(iterators.size() - 1);
        if(!iterator.hasNext()){
            iterators.remove(iterators.size() - 1);
            return hasNext();
        }else{
            return true;
        }
    }
    @Override
    public Component next(){
        if(hasNext()){
            Iterator iterator = iterators.get(iterators.size() - 1);
            Component component = (Component)iterator.next();
            iterators.add(component.iterator());
            return component;
        }
        return null;
    }
}
