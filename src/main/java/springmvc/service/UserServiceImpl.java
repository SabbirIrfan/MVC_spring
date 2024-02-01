package springmvc.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import springmvc.Dao.UserDao;
import springmvc.model.User;
@Service
public class UserServiceImpl implements UserService{
    @Autowired
    private UserDao userDao;
    @Override
    public User getUserService(int id){
        return userDao.getUser(id);
    }
    @Override
    public boolean isNewUserService(int id){
        return userDao.getUser(id) != null;
    }
    @Override
    public void saveUserService(User user){
        userDao.saveUser(user);
    }
    @Override
    public void updateUserService(User user){
        userDao.updateUser(user);
    }
}
