package springmvc.service;

import springmvc.Dao.ProductDao;
import springmvc.model.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductService {
    private ProductDao productDao;

    public ProductDao getNoteDao() {
        return this.productDao;
    }
    @Autowired

    public void setProductDao(ProductDao productDao) {
        this.productDao = productDao;
    }

    public void saveProduct(Product product){
        this.productDao.saveProduct(product);
    }
}
