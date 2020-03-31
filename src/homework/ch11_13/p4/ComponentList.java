package homework.ch11_13.p4;

import java.util.ArrayList;

/**
 * @author WangMingMing
 * @creat 2020-03-17 9:08
 */
public class ComponentList extends ArrayList<Component> implements Iterator {
    private int position = -1;
    public ComponentList(){

    }
    public boolean hasNext(){
        return position + 1 < this.size();
    }
    public Component next(){
        if(this.hasNext()){
            position++;
            return this.get(position);
        }else{
            return null;
        }
    }



}

