/**
 * Created by lotalorafox on 4/25/2017.
 */
public class Customer extends DomainObject {
    private String _fistname;
    private String _lastname;
    private String _telephone;
    private String _street1;
    private String _street2;
    private String _city;
    private String _state;
    private String _zipcode;
    private String _country;

    Customer(String a,String b,String c ,String d,String e,String f,String g,String h,String i,String id){
        super(id);
        _fistname = a;
        _lastname = b;
        _telephone = c;
        _street1 = d;
        _street2 = e;
        _city = f;
        _state =g;
        _zipcode = h;
        _country =i;
    }

}
