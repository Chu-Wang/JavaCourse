package homework.ch11_13.p3;

import java.util.Objects;

/**
 * @author WangMingMing
 * @creat 2020-03-16 15:58
 */
public class Person implements Cloneable{
    private int age;
    private String name;

    public Person(){

    }
    public Person(String name, int age) {
        this.age = age;
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "name: " + this.getName() + ", age: " + this.getAge();
    }

    @Override
    public boolean equals(Object obj) {
        /*if (obj == null || this.getClass() != obj.getClass()) return false;
        if (this == obj) return true;
        Person person = (Person) obj;*/
        if(obj instanceof Person){
            Person person = (Person) obj;
            return this.getAge() == person.getAge() && Objects.equals(this.getName(), person.getName());
        }
        return false;

    }


    @Override
    public Object clone() throws CloneNotSupportedException {
        Person newObj = (Person)(super.clone());
        newObj.age = this.getAge();
        newObj.name = new String(this.getName());
        return newObj;
    }
}
