/**
 * Created by lotalorafox on 28/04/17.
 */
public class Cat extends Pet {
    private boolean isHunter;

    public Cat(String id, String name, String hairColor, boolean isHunter) {
        super(id, name, hairColor);
        this.isHunter = isHunter;
    }

    @Override
    public String sound() {
        return "Miau";
    }

    public boolean isHunter() {
        return isHunter;
    }
}
