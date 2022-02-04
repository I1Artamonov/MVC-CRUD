package servlet.service;

import servlet.model.User;

import java.util.List;

public interface UserService {
    public void saveUser(User user);
    public void deleteUser(int id);
    public void updateUser(User user);
    public User getUserById(int id);
    public List<User> getAllUsers();
}
