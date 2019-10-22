package lv.jg.lesson3;

//Ok
public class Product {

    //visiem klases "laukiem" jeb "klases mainīgajiem" ir jābūt "private",
    // jo objekta stāvoklim dŗīkst piekļūt tikai izmantojot tā metodes
    String name;
    double regularPrice;
    double discount;
    double actualPrice; //šis nav neieciešams, jo netiek izmantots

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getRegularPrice() {
        return regularPrice;
    }

    //ja "klases lauks" ir ar primitīvo tipu, tad to arī vajadzētu izmantot seterī
    public void setRegularPrice(Double regularPrice) {
        this.regularPrice = regularPrice;
    }

    public double getDiscount() {
        return discount;
    }

    //ja "klases lauks" ir ar primitīvo tipu, tad to arī vajadzētu izmantot seterī
    public void setDiscount(Double discount) {
        this.discount = discount;
    }
    public double calculateActualPrice(){
        return regularPrice - regularPrice / 100 * discount;
    }

}
