import java.util.ArrayList;

/**
 * Created by lotalorafox on 4/25/2017.
 */
public class Product extends DomainObject {
    protected String _name;
    protected String _description;
    protected Category _category;
    protected ArrayList<Item> _items = new ArrayList<>();

    Product(String n, String d, String id,Category c) {
        super(id);
        this._name = n;
        this._description = d;
        this._category =c;
    }

    public void additem(Item i) {

        this._items.add(i);
    }

    public void info(){
        for (int i=0; i< _items.size();i++){
            System.out.println("Item " + "#" +(i+1));
            System.out.println("id_item: " +_items.get(i)._id);
            System.out.println("name_item: " + _items.get(i)._name);
            System.out.println("Unit cost_item: " + _items.get(i)._unitCost);
            System.out.println("-----------------------------------------------------");
        }
    }
}
