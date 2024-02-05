package springmvc.service;

import springmvc.Dao.ProductDao;
import springmvc.model.Product;

import java.util.List;

public interface ProductService {
//    public ProductDao getProductDao();
    public Product getProductById(int id);
    public void setProductDao(ProductDao productDao);

    public void saveProduct(Product product);
    public List<Product> getAllProduct();
}
