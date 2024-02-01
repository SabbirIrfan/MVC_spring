package springmvc.service;

import springmvc.Dao.ProductDao;
import springmvc.model.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductServiceImpl implements ProductService{
    private ProductDao productDao;

    @Override
    public ProductDao getNoteDao() {
        return this.productDao;
    }
    @Override
    @Autowired
    public void setProductDao(ProductDao productDao) {
        this.productDao = productDao;
    }

    @Override
    public void saveProduct(Product product){
        this.productDao.saveProduct(product);
    }
}
