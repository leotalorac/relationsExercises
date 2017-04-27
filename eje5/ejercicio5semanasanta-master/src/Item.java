import java.util.ArrayList;

/**
 * Created by lotalorafox on 4/25/2017.
 */
public class Item extends DomainObject{
    protected String _name;
    protected Double _unitCost;
    protected Product _product;

    Item(String n, Double ut,String id,Product p){
        super(id);
        this._name = n;
        this._unitCost = ut;
        this._product = p;
    }
}
