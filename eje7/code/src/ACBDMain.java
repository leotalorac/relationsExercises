/**
 * Created by lotalorafox on 29/04/17.
 */
public class ACBDMain {
    public static void main(String[] args){
        G[] elements = {new G(), new F(), new H(), new E()};

        for (int i=0;i<elements.length;i++){
            System.out.println(elements[i]);
            elements[i].method1();
            elements[i].method2();
            System.out.println();
        }
    }
}
