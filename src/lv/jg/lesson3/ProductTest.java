package lv.jg.lesson3;

public class ProductTest {
    public static void main(String[] args) {
        Product product = new Product();
        product.setName("Milk");
        product.setRegularPrice( 0.8 );
        product.setDiscount( 20.0 );


        double calculateActualPrice = product.calculateActualPrice(  );


        System.out.print ("Product information:");
        System.out.println("Name " + product.getName());
        System.out.println("Regular price  " + product.getRegularPrice());
        System.out.println("Discount  " + product.getDiscount()+ "%");
        System.out.println ("Actual price  "+ calculateActualPrice);

    }
}
