package ec.edu.espe.ConixCoffeeAndIceCreamShop.model;

public class OtherProduct extends Product {

    public OtherProduct(int id, String name,
            float sellingPrice, float cost) {

        super(id, name, sellingPrice, cost);
    }

    @Override
    public float calculateFinalPrice() {
        return getSellingPrice();
    }
}