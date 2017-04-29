/**
 * Created by lotalorafox on 28/04/17.
 */
public class Hamster extends Pet {
    private double weight;

    public Hamster(String id, String name, String hairColor, double weight) {
        super(id, name, hairColor);
        this.weight = weight;
    }

    @Override
    public String sound() {
        return "mi mi mi";
    }

    public double getWeight() {
        return weight;
    }
}
