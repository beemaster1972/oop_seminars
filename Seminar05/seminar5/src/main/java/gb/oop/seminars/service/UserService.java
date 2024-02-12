package gb.oop.seminars.service;

import gb.oop.seminars.model.Student;
import gb.oop.seminars.model.Teacher;
import gb.oop.seminars.model.User;

import java.util.ArrayList;
import java.util.List;

public class UserService implements DataService {
    List<User> usersList = new ArrayList<>();

    @Override
    public void create(User user) {
        int countStudent = 0;
        int countTeacher = 0;
        for (User el : usersList) {
            if (el instanceof Student) {
                countStudent++;
            } else countTeacher++;
        }
        if (user instanceof Student){
            ((Student) user).setIdStudent(++countStudent);
        } else {
            ((Teacher) user).setIdTeacher(++countTeacher);
        }

        usersList.add(user);
    }

    @Override
    public User read(int id) {
        for (User user : usersList) {
            if (user instanceof Student && ((Student) user).getIdStudent().equals(id)){
                return user;
            }
        }
        return null;
    }
}
