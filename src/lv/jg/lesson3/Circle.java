package lv.jg.lesson3;

//OK
public class Circle {

    //visiem klases "laukiem" jeb "klases mainīgajiem" ir jābūt "private",
    // jo objekta stāvoklim dŗīkst piekļūt tikai izmantojot tā metodes
    double radius;

    //šī metode nav nepieciešama, jo netiek izmantota
    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    //mainīgā nosaukums ir slikts
    double calculateArea(double v){
        return 3.14 * radius *radius; }
}
