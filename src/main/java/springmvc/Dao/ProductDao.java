package springmvc.Dao;

import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.transaction.annotation.Transactional;
import springmvc.model.Product;
import org.springframework.stereotype.Repository;

@Repository
public class ProductDao {

    private HibernateTemplate hibernateTemplate;


    public ProductDao() {
        super();
    }


    public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
        this.hibernateTemplate = hibernateTemplate;
    }


    public ProductDao(HibernateTemplate hibernateTemplate) {
        this.hibernateTemplate = hibernateTemplate;
    }

    @Transactional
    public void saveProduct(Product product){
        this.hibernateTemplate.save(product);

    }

    public HibernateTemplate getHibernateTemplate() {
        return hibernateTemplate;
    }

}
