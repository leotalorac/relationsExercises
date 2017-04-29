/**
 * Created by lotalorafox on 29/04/17.
 */
public class Employee extends Person {
    public Employee(){
        this("Invoke Employee's");
        System.out.println("Performs Employee's task");
    }

    public Employee(String s){
        System.out.println(s);
    }
}
