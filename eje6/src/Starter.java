import java.util.ArrayList;
import java.util.*;

/**
 * Created by lotalorafox on 28/04/17.
 */
public class Starter {
    static Scanner sc = new Scanner(System.in);



    public static void  main(String[] args){
        ArrayList<Person> clients = new ArrayList<>();
        Vet v = new Vet();
        int id = 1;
        boolean play = true;
        while(play){
            System.out.println("what do you want to do?");
            System.out.println("1: add client and a pet");
            System.out.println("2: remove pet");
            System.out.println("3: list by type ");
            System.out.println("4: list pets");
            System.out.println("5:list pets of a person");
            System.out.println("6: out");
            int o = sc.nextInt();
            switch (o){
                case 1:
                    String i = Integer.toString(id);
                    readPets(v,i,clients);
                    id++;
                    break;
                case 2:
                    managePet(v,"2",clients);
                    break;
                case 3:
                    managePet(v,"3",clients);
                    break;
                case 4:
                    managePet(v,"4",clients);
                    break;
                case 5:
                    for (int j =0;j<clients.size();j++){
                            System.out.println("Name: " + clients.get(j).getName() + " ID: " + clients.get(j).getId());
                    }
                    System.out.println("insert the id of the person");
                    int h = sc.nextInt();


                    for (int w =0; w<clients.size();w++){
                        String a = Integer.toString(h);
                        if(a.equals(clients.get(w).getId())) {
                            clients.get(w).showPets();
                        }
                    }



                    break;
                case 6:
                    play = false;
                    break;
            }

        }


    }

    public static void readPets(Vet v, String id, ArrayList<Person> clients){
        System.out.println("insert your name:");
        String n = sc.next();
        Person p = new Person(n,id);

        System.out.println("How many pets do you have?");
        int np = sc.nextInt();
        for (int i=0;i<np;i++){
            Pet pe = null;
            System.out.println("Select the type of your pet");
            System.out.println("1: Dog   2:Cat    3:Hamster");
            int t = sc.nextInt();
            System.out.println("insert the name of your pet");
            String namep = sc.next();
            System.out.println("insert the hair color of your pet");
            String hairp = sc.next();


            String pid = id + (i+1);
            if (t == 1){
                System.out.println("it breed?");
                String br = sc.next();
                pe = new Dog(pid,namep,hairp,br);
            }else if(t == 2){
                System.out.println("is hunter?   1:Yes    2:No");
                int ht = sc.nextInt();
                boolean hn;
                if(ht == 1){
                    hn = true;
                }else{
                    hn =false;
                }
                pe = new Cat(pid,namep,hairp,hn);

            }else if(t==3){
                System.out.println("insert the weigth");
                double w = sc.nextDouble();
                pe = new Hamster(pid,namep,hairp,w);
            }else {
                System.out.println("the pet's type does not exist ");
            }
            p.addpet(pe);
            v.addpet(pe);
        }
        clients.add(p);

    }

    public static void managePet(Vet v, String o,ArrayList<Person> c){
        if(o.equals("2")){
            v.showPets();
            System.out.println("insert the id of the pet");
            String idf = sc.next();
            for (int i= 0;i<v.getPets().size();i++){

                if(idf.equals( v.getPets().get(i).getId())){
                    for (int j = 0;j<c.size();j++){
                        for(int l = 0;l<c.get(j).getPets().size();l++){
                            if(idf.equals(c.get(j).getPets().get(l).getId())){
                                c.get(j).getPets().remove(c.get(j).getPets().get(l));
                                if(c.get(j).getPets().size() <= 0 ){
                                    c.remove(c.get(j));
                                    break;
                                }
                            }
                        }

                    }
                    v.remove(v.getPets().get(i));

                }
            }
        }else if(o.equals("3")){
            System.out.println("insert the pet's type");
            String t = sc.next();
            v.showPetsByType(t);

        }else if(o.equals("4")){
            v.showPets();
        }
    }
}
