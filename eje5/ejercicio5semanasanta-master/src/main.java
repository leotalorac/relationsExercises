import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by lotalorafox on 4/25/2017.
 */
public class main {
    public static void main(String [] args){
        //Scanner object
        Scanner sc = new Scanner(System.in);
        int iduser =1;

        //User data -- only one client--
        /*
        System.out.println("Welcome to the new Software, please insert your data to begin: ");
        System.out.println("Fistname: ");
        String u1 = sc.next();
        System.out.println("Lastname: ");
        String u2 = sc.next();
        System.out.println("Telephone: ");
        String u3 = sc.next();
        System.out.println("Street1: ");
        String u4 = sc.next();
        System.out.println("Street2: ");
        String u5 = sc.next();
        System.out.println("City: ");
        String u6 = sc.next();
        System.out.println("State: ");
        String u7 = sc.next();
        System.out.println("Zipcode: ");
        String u8 = sc.next();
        System.out.println("Country: ");
        String u9 = sc.next();
        String idtochar = Integer.toString(iduser);
        iduser++;
        Customer user = new Customer(u1,u2,u3,u4,u5,u6,u7,u8,u9,idtochar);
        //id counters
        */
        int ca=0;
        int pr=0;
        int it=0;

        //init
        boolean play = true;
        boolean addproduct = true;
        boolean additem =true;
        System.out.println("how many categorizes do you want create?");
        int hm = sc.nextInt();

        Category categories[] = new Category[hm];


        while(ca<hm){
            System.out.println("insert the name of the category: ");
            String c1 = sc.next();
            System.out.println("insert the description of the category (whitout spaces)");
            String c2 = sc.next();
            String c3 = Integer.toString(ca+1);

                categories[ca] = new Category(c1,c2,c3);
                while(addproduct) {
                    System.out.println("insert the name of the product");
                    String p1 = sc.next();
                    System.out.println("insert the description of the product");
                    String p2 = sc.next();
                    String p3 = Integer.toString(ca+1) + Integer.toString(pr+1);

                    categories[ca].addproduct(p1,p2,p3,categories[ca]);

                    while (additem){
                        System.out.println("insert the name of the item");
                        String i1 = sc.next();
                        System.out.println("insert the unitCost of the item");
                        Double i2 = sc.nextDouble();
                        String i3 = Integer.toString(ca+1) + Integer.toString(pr+1) + Integer.toString(it+1);
                        System.out.println(pr);
                        categories[ca].get_products().get(pr).additem(i1,i2,i3,categories[ca].get_products().get(pr));

                        it++;
                        System.out.println("Do you want add other item?  1:YES   2:NO ");
                        int option3 = sc.nextInt();
                        if(option3 == 2){
                            additem = false;
                        }
                    }

                    additem = true;
                    System.out.println("Do you want add other product?  1:YES   2:NO ");
                    int option2 = sc.nextInt();
                    pr++;
                    if(option2 == 2){
                        addproduct = false;
                    }
                }
                ca++;
                pr =0;
                addproduct = true;

        }
        System.out.println("No more categories");

        System.out.println("List..........");
        for (int i =0;i<categories.length;i++){
            categories[i].list();
        }



    }
}
