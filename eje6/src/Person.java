import java.util.ArrayList;

/**
 * Created by lotalorafox on 28/04/17.
 */
public class Person {
    private String name;
    private String id;
    private ArrayList<Pet> pets = new ArrayList<>();

    public Person(String name, String id) {
        this.name = name;
        this.id = id;

    }

    public void addpet(Pet p){
        this.pets.add(p);
    }


    public void showPets(){
        System.out.println("Owner: " + this.name);
        System.out.println("Pets: ");
        for (Pet p:pets){
            System.out.println("ID: "+p.getId() + " Name: " + p.getName() + " hairColor: " + p.getHairColor()  + " and it does " + p.sound());
        }
    }

    public String getName() {
        return name;
    }

    public String getId() {
        return id;
    }

    public ArrayList<Pet> getPets() {
        return pets;
    }
}
