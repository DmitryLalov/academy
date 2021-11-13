package by.academy.classwork.lesson7;

public class Product {
    String nameProduct;
    double costProduct;
    public Product (String nameProduct, double costProduct){
        this.nameProduct=nameProduct;
        this.costProduct=costProduct;
    }
    public void setNameProduct(String nameProduct){
        this.nameProduct=nameProduct;
    }
    public void setCostProduct(double costProduct){
        this.costProduct=costProduct;
    }

    @Override
    public String toString() {
        return "Product{" +
                "nameProduct='" + nameProduct + '\'' +
                ", costProduct=" + costProduct +
                '}';
    }
}
