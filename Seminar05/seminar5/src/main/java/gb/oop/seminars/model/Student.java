package gb.oop.seminars.model;


public class Student extends User{
    private Integer idStudent;

    public Student(Integer idStudent) {
        this.idStudent = idStudent;
    }

    public Student(String fullName, String dateOfBirth, Integer idStudent) {
        super(fullName, dateOfBirth);
        this.idStudent = idStudent;
    }

    public Integer getIdStudent() {
        return idStudent;
    }

    public void setIdStudent(Integer idStudent) {
        this.idStudent = idStudent;
    }

    @Override
    public String toString() {
        return "Student{" +
                "idStudent=" + idStudent +
                " "+ super.toString();
    }
}
