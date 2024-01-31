package springmvc.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import springmvc.Dao.UserDao;
import springmvc.model.User;
@Service
public class UserService {
    @Autowired
    private UserDao userDao;

    public User getUser(int id){
        return userDao.getUser(id);
    }
    public boolean isNewUser(int id){
        return userDao.getUser(id) != null;
    }

    public void saveUser(User user){
        userDao.saveUser(user);
    }

    public void updateUser(User user){
        userDao.updateUser(user);
    }
}
