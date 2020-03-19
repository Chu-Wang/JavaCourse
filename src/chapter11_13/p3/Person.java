package chapter11_13.p3;

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
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Person person = (Person) obj;
        return age == person.age && name.equals(person.name);
    }


    @Override
    protected Object clone() throws CloneNotSupportedException {
        Person newObj = (Person)(super.clone());
        newObj.age = this.getAge();
        newObj.name = new String(this.getName());
        return newObj;
    }
}
