package gb.oop.seminars.model;

public abstract class User {

    public User() {
    }

    public User(String fullName, String dateOfBirth) {
        this.fullName = fullName;
        this.dateOfBirth = dateOfBirth;
    }

    private String fullName;
    private String dateOfBirth;

    @Override
    public String toString() {
        return "fullName='" + fullName + '\'' +
                ", dateOfBirth='" + dateOfBirth + '\'' +
                '}';
    }
}
