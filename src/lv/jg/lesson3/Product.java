package lv.jg.lesson3;

public class Product {

    String name;
    double regularPrice;
    double discount;
    double actualPrice;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getRegularPrice() {
        return regularPrice;
    }

    public void setRegularPrice(Double regularPrice) {
        this.regularPrice = regularPrice;
    }

    public double getDiscount() {
        return discount;
    }

    public void setDiscount(Double discount) {
        this.discount = discount;
    }
    public double calculateActualPrice(){
        return regularPrice - regularPrice / 100 * discount;
    }

}
