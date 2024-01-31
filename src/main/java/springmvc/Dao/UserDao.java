package springmvc.Dao;

import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import springmvc.model.User;

@Repository
public class UserDao {

    private HibernateTemplate hibernateTemplate;

    public UserDao(HibernateTemplate hibernateTemplate) {
        this.hibernateTemplate = hibernateTemplate;
    }

    public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
        this.hibernateTemplate = hibernateTemplate;
    }
    public HibernateTemplate getHibernateTemplate() {
        return hibernateTemplate;
    }
    @Transactional
    public void saveUser(User user){
        this.hibernateTemplate.save(user);

    }
    public User getUser(int id){
        return this.hibernateTemplate.get(User.class, id);
    }
    @Transactional
    public void updateUser(User user){

        this.hibernateTemplate.update(user);
    }





}
