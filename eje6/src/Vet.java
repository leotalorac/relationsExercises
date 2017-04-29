import java.util.ArrayList;

/**
 * Created by lotalorafox on 28/04/17.
 */
public class Vet {
    private ArrayList<Pet> pets = new ArrayList<>();

    public void addpet(Pet p){
        pets.add(p);
    }

    public void remove(Pet p){
        pets.remove(p);
    }

    public void showPetsByType(String s){
        if(s.equals("Hamster")){
            for (Pet p:pets){
                if(p instanceof Hamster){
                    System.out.println("Type: Hamster " + "ID: "+p.getId() + " Name: " + p.getName() + " hairColor: " + p.getHairColor() + " and it does " + p.sound());
                }
            }
        }else if(s.equals("Cat")){
            for (Pet p:pets){
                if(p instanceof Cat){
                    System.out.println("Type: Cat " + "ID: "+p.getId() + " Name: " + p.getName() + " hairColor: " + p.getHairColor() + " and it does " + p.sound());
                }
            }
        }else if(s.equals("Dog")){
            for (Pet p:pets){
                if(p instanceof Dog){
                    System.out.println("Type: Dog " + "ID: "+p.getId() + " Name: " + p.getName() + " hairColor: " + p.getHairColor() + " and it does " + p.sound());
                }
            }
        }else{
            System.out.println("No es un tipo valido, vuelve a intentar");
        }

    }

    public void showPets(){
        for (Pet p:pets){
            System.out.println("ID: "+p.getId() + " Name: " + p.getName() + " hairColor: " + p.getHairColor() +  " and it does " + p.sound());
        }
    }

    public ArrayList<Pet> getPets(){
        return pets;
    }
}
