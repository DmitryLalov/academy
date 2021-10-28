package by.academy.classwork.lesson3;

public class Product {
    String nameProduct;
    int productQuantity;
    double productPrice;
    public Product(){

    }
    public Product(String nameProduct, int productQuantity, double productPrice){
        this.nameProduct=nameProduct;

        this.productQuantity=productQuantity;
        this.productPrice=productPrice;
    }
        public void setNameProduct(String nameProduct){
            this.nameProduct=nameProduct;
        }
        public void setProductQuantity(int productQuantity){
            this.productQuantity=productQuantity;
        }
        public void setProductPrice(double productPrice){
            this.productPrice=productPrice;
        }

        public String getNameProduct(){
            return nameProduct;
        }

        public int getProductQuantity(){
            return productQuantity;
        }

        public double getProductPrice() {
            return productPrice;
        }

    @Override
    public String toString() {
        return "Product{" +
                "nameProduct='" + nameProduct + '\'' +
                ", productQuantity=" + productQuantity +
                ", productPrice=" + productPrice +
                '}';
    }
}
