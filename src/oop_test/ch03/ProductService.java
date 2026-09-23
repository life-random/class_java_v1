package oop_test.ch03;

public class ProductService {
    ProductDao dao = new ProductDao();

    public void registerProduct(String name, int price){
        dao.insertProduct(new Product(name, price));
    }
}
