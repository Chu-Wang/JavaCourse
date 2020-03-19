package chapter11_13.p3;

import java.util.Objects;

/**
 * @author WangMingMing
 * @creat 2020-03-16 16:08
 */
public class Faculty extends Person implements Cloneable{
    private int facultyId;
    private String title;
    private String email;

    public Faculty() {

    }

    public Faculty(String name, int age, int facultyId, String title, String email) {
        super(name, age);
        this.facultyId = facultyId;
        this.title = title;
        this.email = email;
    }

    public int getFacultyId() {
        return facultyId;
    }

    public void setFacultyId(int facultyId) {
        this.facultyId = facultyId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public boolean equals(Object obj) {
        if(super.equals(obj)){
            if (this == obj) return true;
            if (obj == null || getClass() != obj.getClass()) return false;
            if (!super.equals(obj)) return false;
            Faculty faculty = (Faculty) obj;
            return facultyId == faculty.facultyId &&
                    Objects.equals(title, faculty.title) &&
                    Objects.equals(email, faculty.email);
        }
        return false;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        Faculty newObj = (Faculty)(super.clone());
        newObj.facultyId = this.facultyId;
        newObj.title = new String(this.title);
        newObj.email = new String(this.email);
        return newObj;
    }

    @Override
    public String toString() {
        String str = "Teacher Info: ";
        str += super.toString();
        return str + ", facultyId: " + this.getFacultyId() +
                ", title: " + this.getTitle() +
                ", email: " + this.getEmail() + "\n";
    }
}
