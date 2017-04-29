/**
 * Created by lotalorafox on 28/04/17.
 */
public class Dog extends Pet{
    private String breed;

    public Dog(String id, String name, String hairColor, String breed) {
        super(id, name, hairColor);
        this.breed = breed;
    }

    @Override
    public String sound() {
        return "Woof";
    }

    public String getBreed() {
        return breed;
    }
}
