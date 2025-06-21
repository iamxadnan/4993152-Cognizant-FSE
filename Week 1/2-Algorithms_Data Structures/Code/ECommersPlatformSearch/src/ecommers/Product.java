package ecommers;

public class Product {
    int ProductId;
    String ProductName;
    String Category;  
    public Product(int pid,String pname,String category) {
        ProductId=pid;
        ProductName=pname;
        Category=category;
    }

    @Override
    public String toString() {
        return ProductId +" - " + ProductName +" - "+ Category ;
    }
}
