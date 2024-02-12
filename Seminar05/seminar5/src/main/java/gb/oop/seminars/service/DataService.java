package gb.oop.seminars.service;

import gb.oop.seminars.model.User;

public interface DataService {
    void create(User user);
    User read(int id);
}
