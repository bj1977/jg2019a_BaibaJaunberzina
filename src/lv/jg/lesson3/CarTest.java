package lv.jg.lesson3;

public class CarTest {
    public static void main(String[] args) {
        Car car = new Car();
        car.setManufacturer( "BMW X5" );
        car.setColor( "Blue" );
        car.setYear( 2015 );

        System.out.println("Manufacturer  " + car.getManufacturer());
        System.out.println("Color  " + car.getColor());
        System.out.println("Year  " + car.getYear());
    }
}
