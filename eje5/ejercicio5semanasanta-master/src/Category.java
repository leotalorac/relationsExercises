import java.util.ArrayList;

/**
 * Created by lotalorafox on 4/25/2017.
 */
public class Category extends DomainObject{
    protected String _name;
    protected String _description;
    protected ArrayList<Product> _products = new ArrayList<>();

    Category(String n,String d,String id){
        super(id);
        _name = n;
        _description = d;
    }

    public void addproduct(String a,String b,String c,Category d){
        Product p = new Product(a,b,c,d);
        this._products.add(p);
    }
    public void list(){
        System.out.println("Category's id: " + this._id);
        System.out.println("Category's name: " + this._name);
        System.out.println("Category's description: " + this._description);

        for (int i = 0; i<_products.size();i++){
            System.out.println("id_Product: " + _products.get(i)._id);
            System.out.println("Name_Product: " + _products.get(i)._name);
            System.out.println("Description_Product: " + _products.get(i)._description);
            _products.get(i).info();
        }
    }

    public ArrayList<Product> get_products() {
        return _products;
    }
}
