package springmvc.service;

import springmvc.model.User;

public interface UserService {
    public User getUserService(int id);
    public boolean isNewUserService(int id);
    public void saveUserService(User user);
    public void updateUserService(User user);
}
