package gb.oop.seminars.controller;

import gb.oop.seminars.model.Student;
import gb.oop.seminars.model.Teacher;
import gb.oop.seminars.model.User;
import gb.oop.seminars.service.DataService;
import gb.oop.seminars.service.UserService;
import gb.oop.seminars.view.StudentView;


public class Controller {
    private DataService service;
    private StudentView view;
    public Controller() {
        service = new UserService();
        view = new StudentView();
    }

    public void run(){
        User stud1 = new Student("Ivan", "01.01.2000", 1);
        service.create(stud1);
        User teacher1 = new Student("Vasya", "01.01.1980", 1);
        service.create(teacher1);
        service.create(stud1);
        Student stud2 = (Student) service.read(2);
        view.print(stud2);
    }
}
