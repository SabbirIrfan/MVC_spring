package springmvc.service;

import springmvc.Dao.ProductDao;
import springmvc.model.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductServiceImpl implements ProductService{
    private ProductDao productDao;

    @Override
    public Product getProductById(int id) {
        return productDao.getProductById(id);
    }

    //    @Override
//    public ProductDao getProductDao() {
//        return this.productDao;
//    }
    @Override
    @Autowired
    public void setProductDao(ProductDao productDao) {
        this.productDao = productDao;
    }

    @Override
    public void saveProduct(Product product){
        this.productDao.saveProduct(product);
    }

    @Override
    public List<Product> getAllProduct() {
        return productDao.getAllProduct();
    }
}
