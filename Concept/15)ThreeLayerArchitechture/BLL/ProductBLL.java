package org.example.BLL;

import org.example.DAL.ProductDAL;
import org.example.customexceptions.ProductPriceException;
import org.example.models.Product;

import java.util.List;

public class ProductBLL {

    private ProductDAL productDAL;

    public ProductBLL() throws Exception {
        productDAL = new ProductDAL();
    }

    public boolean save(Product product) throws Exception, ProductPriceException {
        if (product.getPrice() <= 0) {
            throw new ProductPriceException();
        }

        return productDAL.save(product);
    }

    public List<Product> getProducts() throws Exception {
        return productDAL.getProducts();
    }

    public boolean update(Product product) throws Exception {
        return productDAL.updateProduct(product);
    }

    public boolean deleteProduct(int id) throws Exception {
        return productDAL.deleteProduct(id);
    }

    public Product findById(int id) throws Exception {
        return productDAL.findById(id);
    }

    public List<Product> findByPrice(double price) throws Exception {
        return productDAL.findByPrice(price);
    }
}
