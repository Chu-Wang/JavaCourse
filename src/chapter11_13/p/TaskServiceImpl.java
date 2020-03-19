package chapter11_13.p;

import java.util.ArrayList;
import java.util.List;

/**
 * @author WangMingMing
 * @creat 2020-03-16 14:33
 */
public class TaskServiceImpl implements TaskService{
    List<Task> listTasks = new ArrayList<Task>();

    public static void main(String[] args) {
        //首先测试三个具体类
        System.out.println("-------下列输出: 测试实现Task接口的三个具体类-------");
        FirstClass firstClass = new FirstClass();
        firstClass.execute();
        SecondClass secondClass = new SecondClass();
        secondClass.execute();
        ThirdClass thirdClass = new ThirdClass();
        thirdClass.execute();
        System.out.println("-------------------------------------------------");
        System.out.println();
        //测试实现TaskService接口的类
        System.out.println("-------下列输出: 测试实现TaskService接口的具体类------");
        TaskServiceImpl taskServiceImpl = new TaskServiceImpl();
        taskServiceImpl.execute();
        //将上述的三个具体类添加
        taskServiceImpl.addTask(firstClass);
        taskServiceImpl.addTask(secondClass);
        taskServiceImpl.addTask(thirdClass);
        System.out.println("----下面是将三个具体类对象添加到List之后打印List里面的内容----");
        taskServiceImpl.executeTasks();


    }
    public void execute(){
        System.out.println("这是第四个具体类TaskServiceImpl的任务执行");
    }
    public void executeTasks(){
        for(Task t : listTasks){
            System.out.println(t.toString());
        }
    }
    public void addTask(Task t){
        listTasks.add(t);
    }
}



class FirstClass implements Task{
    public FirstClass(){

    }
    public void execute(){
        System.out.println("这是第一个具体类FirstClass的任务执行");
    }

    @Override
    public String toString() {
        return "打印第一个类";
    }
}

class SecondClass implements Task{
    public SecondClass(){

    }
    public void execute(){
        System.out.println("这是第二个具体类SecondClass的任务执行");
    }

    @Override
    public String toString() {
        return "打印第二个类";
    }
}
class ThirdClass implements Task{
    public ThirdClass(){

    }
    public void execute(){
        System.out.println("这是第三个具体类ThirdClass的任务执行");
    }

    @Override
    public String toString() {
        return "打印第三个类";
    }
}
