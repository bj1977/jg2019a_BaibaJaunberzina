package lv.jg.lesson3;

//OK
public class Car {

    //visiem klases "laukiem" jeb "klases mainīgajiem" ir jābūt "private",
    // jo objekta stāvoklim dŗīkst piekļūt tikai izmantojot tā metodes
    String manufacturer;
    String color;
    int year;

    public String getManufacturer(){
        return manufacturer;

    }

    public void setManufacturer(String manufacturer){
        this.manufacturer = manufacturer;

    }
    public String getColor(){
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getYear(){
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }
}
