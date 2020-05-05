package homework.ch30.p1;

/**
 * @author WangMingMing
 * @creat 2020-04-17 19:34
 */
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class Container<T>{
    private List<T> elements = new ArrayList<>();

    public  void add(T e) {
        elements.add(e);
    }

    public T remove(int index){
        return elements.remove(index);
    }

    public int size(){
        return elements.size();
    }

    public T get(int index){
        return elements.get(index);
    }
}

public class Test {

    public static void testAdd(){
        Container<Integer> container = new Container<>();
        int addLoops = 10;  //addTask 内的循环次数
        Runnable addTask = new Runnable() {
            @Override
            public synchronized void run() {
                for(int i = 0; i < addLoops; i++) {
                    container.add(i);
                }
            }
        };
        int addTaskCount = 100; //addTask 线程个数
        ExecutorService es = Executors.newCachedThreadPool();
        for(int i = 0; i < addTaskCount; i++){
            es.execute(addTask);
        }
        es.shutdown();
        while (!es.isTerminated()){}
        System.out.println("Test add " + (addLoops * addTaskCount) +
                " elements to container");
        System.out.println("Container size = " + container.size() +
                ", correct size = " + (addLoops * addTaskCount));
    }

    public static void testRemove(){
        Container<Integer> container = new Container<>();
        int removeLoops = 10; //removeTask 内的循环次数
        int removeTaskCount = 100; //removeTask 线程个数

        //首先添加 removeLoops * removeTask 个元素到容器
        for(int i = 0; i < removeLoops * removeTaskCount; i++){
            container.add(i);
        }
        Runnable removeTask = new Runnable() {
            @Override
            public synchronized void run() {
                for(int i = 0 ; i < removeLoops; i++){
                    container.remove(0);
                }
            }
        };

        ExecutorService es = Executors.newCachedThreadPool();
        for(int i = 0; i < removeTaskCount; i++){
            es.execute(removeTask);
        }
        es.shutdown();
        while (!es.isTerminated()){}

        System.out.println("Test remove " + (removeLoops * removeTaskCount) +
                " elements from container");
        System.out.println("Container size = " + container.size() +
                ", correct size = 0");
    }

    public static void main(String[] args){
        testAdd();
        testRemove();
    }
}