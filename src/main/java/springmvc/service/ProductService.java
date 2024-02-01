package springmvc.service;

import springmvc.Dao.ProductDao;
import springmvc.model.Product;

public interface ProductService {
    public ProductDao getNoteDao();
    public void setProductDao(ProductDao productDao);

    public void saveProduct(Product product);
}
