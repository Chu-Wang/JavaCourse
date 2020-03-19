package chapter11_13.p3;

import java.util.Objects;

/**
 * @author WangMingMing
 * @creat 2020-03-16 16:11
 */
public class Student extends Person implements Cloneable{
    private int studentId;
    private String department;
    private String classNo;
    public Student(){

    }

    public Student(String name, int age, int studentId, String department, String classNo) {
        super(name, age);
        this.studentId = studentId;
        this.department = department;
        this.classNo = classNo;
    }

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getClassNo() {
        return classNo;
    }

    public void setClassNo(String classNo) {
        this.classNo = classNo;
    }

    @Override
    public boolean equals(Object obj) {
        if(super.equals(obj)) {
            if (this == obj) return true;
            if (obj == null || getClass() != obj.getClass()) return false;
            if (!super.equals(obj)) return false;
            Student student = (Student) obj;
            return studentId == student.studentId &&
                    Objects.equals(department, student.department) &&
                    Objects.equals(classNo, student.classNo);
        }
        return false;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        Student newObj = (Student)(super.clone());
        newObj.studentId = this.studentId;
        newObj.classNo = new String(this.classNo);
        newObj.department = new String(this.department);
        return newObj;

    }

    @Override
    public String toString() {
        String str = "";
        str += super.toString();
        return str + ", studentId: " + this.getStudentId() +
                ", department: " + this.getDepartment() +
                ", classNo: " + this.getClassNo() + "\n";
    }
}
