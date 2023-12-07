package ru.masliakov.pp_3_1_1.service;


import ru.masliakov.pp_3_1_1.model.User;
import java.util.List;

public interface UserService {

    public List<User> getAllUsers();

    public void saveUser(User user);

    public User getUser(int id);

    public void deleteUser(int id);
}
