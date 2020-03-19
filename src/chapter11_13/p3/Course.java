package chapter11_13.p3;

import java.util.ArrayList;
import java.util.List;

/**
 * @author WangMingMing
 * @creat 2020-03-16 16:01
 */
public class Course implements Cloneable{
    private String courseName;
    private List<Person> students = new ArrayList<>();
    private Person teacher;

    public Course(String courseName, Person teacher) {
        this.courseName = courseName;
        this.teacher = teacher;
    }

    public void register(Person s){
        if(!students.isEmpty() && students.contains(s)){
            System.out.println("该学生对象已经存在");
        }else{
            students.add(s);
        }
    }

    public String getCourseName() {
        return courseName;
    }

    public List<Person> getStudents() {
        return students;
    }

    public Person getTeacher() {
        return teacher;
    }
    public void unregister(Person s){
        //如果不存在
        if(!students.contains(s)){
            //暂时什么也不做
        }else{
            students.remove(s);
        }
    }
    public int getNumberOfStudent(){
        return students.size();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Course course = (Course) obj;
        return courseName.equals(course.courseName) &&
                (course.students.size() == students.size() && students.containsAll(course.students)) &&
                teacher.equals(course.teacher);
    }



    @Override
    protected Object clone() throws CloneNotSupportedException {
        Course newObj = (Course)(super.clone());
        newObj.teacher = (Person)(this.teacher.clone());
        newObj.courseName = new String(this.courseName);
        List<Person> list = new ArrayList<Person>();
        for(Person s : this.students){
            list.add(((Person)s.clone()));
        }
        newObj.students = list;
        return newObj;
    }


    @Override
    public String toString() {
        String str = new String();
        str = "Course Name: " + this.getCourseName() + "\n" +
                this.teacher.toString() + "Student List: \n";
        for(Person s : this.students){
            str += s.toString();
        }
        str += "Totally: " + this.getNumberOfStudent() + " students.\n";
        return str;
    }
}
