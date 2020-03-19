package chapter11_13.p;

/**
 * @author WangMingMing
 * @creat 2020-03-16 14:30
 * 任务服务接口
 */
public interface TaskService {
    /**
     * 执行任务接口列表中的每个任务
     */
    public void executeTasks();

    /**
     * 添加任务
     * @param t 新添加的任务
     */
    public void addTask(Task t);

}
