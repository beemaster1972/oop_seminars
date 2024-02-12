package gb.oop.seminars.model;

public class Teacher extends User{
    private Integer idTeacher;

    public Teacher(Integer idTeacher) {
        this.idTeacher = idTeacher;
    }

    public Teacher(String fullName, String dateOfBirth, Integer idTeacher) {
        super(fullName, dateOfBirth);
        this.idTeacher = idTeacher;
    }

    public Integer getIdTeacher() {
        return idTeacher;
    }

    public void setIdTeacher(Integer idTeacher) {
        this.idTeacher = idTeacher;
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "idTeacher=" + idTeacher +
                " "+super.toString();
    }
}
