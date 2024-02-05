package springmvc.Dao;

import org.hibernate.criterion.DetachedCriteria;
import org.hibernate.criterion.Restrictions;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.transaction.annotation.Transactional;
import springmvc.model.Product;
import org.springframework.stereotype.Repository;
import springmvc.model.User;

import java.util.List;

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
    public  Product getProductById(int id){
        return hibernateTemplate.get(Product.class,id);
    }
    public List<Product> getAllProduct(){
        DetachedCriteria detachedCriteria = DetachedCriteria.forClass(Product.class)
                .add(Restrictions.eq("sold", false));
        List<Product> products = (List<Product>)hibernateTemplate.findByCriteria(detachedCriteria);
        return products;

    }

    public HibernateTemplate getHibernateTemplate() {
        return hibernateTemplate;
    }

}
