package homework.ch11_13.p3;

/**
 * @author WangMingMing
 * @creat 2020-03-16 16:50
 */
public class CourseTest {
    public static void main(String[] args) throws CloneNotSupportedException{
        Person teacher = new Faculty("James Gosling", 65, 0000, "Professor", "http://...");
        Course javaCourse = new Course("Java Language Programming", teacher);
        Person student1 = new Student("aaa", 20, 20170101, "CS", "CS1704");
        Person student2 = new Student("bbb", 20, 20170102, "CS", "CS1705");
        Person student3 = new Student("ccc", 20, 20170103, "CS", "CS1706");
        javaCourse.register(student1);
        javaCourse.register(student2);
        javaCourse.register(student3);
        System.out.println(javaCourse);
        javaCourse.unregister(student3);
        System.out.println(javaCourse);
        //测试是否为深拷贝
        Course javaCourse2 = (Course)javaCourse.clone();
        //javaCourse2.getTeacher().setAge(30);
        //javaCourse2.getTeacher().setName("ggggggg");
        //((Faculty)(javaCourse2.getTeacher())).setFacultyId(100);
        System.out.println(javaCourse.equals(javaCourse2));
        System.out.println(javaCourse.getCourseName() != javaCourse2.getCourseName());
        System.out.println(javaCourse.getTeacher() != javaCourse2.getTeacher());
        System.out.println(javaCourse.getStudents() != javaCourse2.getStudents());
        System.out.println(javaCourse2);
    }
}
