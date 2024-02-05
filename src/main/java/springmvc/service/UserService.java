package springmvc.service;

import springmvc.model.User;

import java.util.List;

public interface UserService {
    public User getUserService(int id);
    public boolean isNewUserService(int id);
    public void saveUserService(User user);
    public void updateUserService(User user);
    public List<User> getUserByEmail(String email);
}
