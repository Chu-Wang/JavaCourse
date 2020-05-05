package homework.ch19.p2;

import homework.ch11_13.p3.Person;

import java.util.*;

/**
 * @author WangMingMing
 * @creat 2020-04-01 10:54
 */
public class TwoTuple<T1 extends Comparable, T2 extends Comparable> implements Comparable{
    private T1 first;
    private T2 second;

    public TwoTuple(T1 first, T2 second){
        this.first = first;
        this.second = second;
    }

    public T1 getFirst() {
        return first;
    }

    public void setFirst(T1 first) {
        this.first = first;
    }

    public T2 getSecond() {
        return second;
    }

    public void setSecond(T2 second) {
        this.second = second;
    }

    @Override
    public int compareTo(Object o) {
        if(o instanceof TwoTuple){
            TwoTuple twoTuple = (TwoTuple)o;
            if(!Objects.equals(this.first, twoTuple.first)){
                return this.first.compareTo(twoTuple.first);
            }
            if(Objects.equals(this.first, twoTuple.first)){
                return this.second.compareTo(twoTuple.second);
            }
        }
        return -1;

    }

    @Override
    public boolean equals(Object obj) {
        if(obj instanceof TwoTuple){
            TwoTuple twoTuple = (TwoTuple) obj;
            return Objects.equals(this.first, ((TwoTuple) obj).first) && Objects.equals(this.second, ((TwoTuple) obj).second);
        }
        return false;
    }

    @Override
    public String toString() {
        return "(" + first.toString() +
                "," + second.toString() +
                ')';
    }

    public static void main(String[] args){

        TwoTuple<Integer,String> twoTuple1 =new TwoTuple<>(1, "ccc");
        TwoTuple<Integer,String> twoTuple2 =new TwoTuple<>(1, "bbb");
        TwoTuple<Integer,String> twoTuple3 =new TwoTuple<>(1, "aaa");
        TwoTuple<Integer,String> twoTuple4 =new TwoTuple<>(2, "ccc");
        TwoTuple<Integer,String> twoTuple5 =new TwoTuple<>(2, "bbb");
        TwoTuple<Integer,String> twoTuple6 =new TwoTuple<>(2, "aaa");
     /* TwoTuple<String,Integer> twoTuple1 =new TwoTuple<>("ccc", 1);
        TwoTuple<String,Integer> twoTuple2 =new TwoTuple<>("bbb", 1);
        TwoTuple<String,Integer> twoTuple3 =new TwoTuple<>("aaa", 1);
        TwoTuple<String,Integer> twoTuple4 =new TwoTuple<>("ccc", 2);
        TwoTuple<String,Integer> twoTuple5 =new TwoTuple<>("bbb", 2);
        TwoTuple<String,Integer> twoTuple6 =new TwoTuple<>("aaa", 2);*/
        List<TwoTuple<Integer,String>> list = new ArrayList<>();
        list.add(twoTuple1);
        list.add(twoTuple2);
        list.add(twoTuple3);
        list.add(twoTuple4);
        list.add(twoTuple5);
        list.add(twoTuple6);

        //测试equals，contains方法是基于equals方法结果来判断
        TwoTuple<Integer, String> twoTuple10 =new TwoTuple<>(1, "ccc"); //内容=twoTuple1
        //TwoTuple<String,Integer> twoTuple10 =new TwoTuple<>("ccc", 1); //内容=twoTuple1
        System.out.println(twoTuple1.equals(twoTuple10)); //应该为true
        if(!list.contains(twoTuple10)){
            list.add(twoTuple10);  //这时不应该重复加入
        }

        //sort方法是根据元素的compareTo方法结果进行排序，课测试compareTo方法是否实现正确
        Collections.sort(list);


        for (TwoTuple<Integer, String> t: list) {
            System.out.println(t);
        }
        /*for (TwoTuple<String,Integer> t: list) {
            System.out.println(t);
        }*/

        TwoTuple<TwoTuple<Integer,String >,TwoTuple<Integer,String >> tt1 =
                new TwoTuple<>(new TwoTuple<>(1,"aaa"),new TwoTuple<>(1,"bbb"));
        TwoTuple<TwoTuple<Integer,String >,TwoTuple<Integer,String >> tt2 =
                new TwoTuple<>(new TwoTuple<>(1,"aaa"),new TwoTuple<>(2,"bbb"));
        /*TwoTuple<TwoTuple<String, Integer>,TwoTuple<String, Integer>> tt1 =
                new TwoTuple<>(new TwoTuple<>("aaa", 1),new TwoTuple<>("bbb", 1));
        TwoTuple<TwoTuple<String, Integer>,TwoTuple<String, Integer>> tt2 =
                new TwoTuple<>(new TwoTuple<>("aaa", 1),new TwoTuple<>("bbb", 2));*/

        System.out.println(tt1.compareTo(tt2)); //输出-1
        System.out.println(tt1);

    }


}

