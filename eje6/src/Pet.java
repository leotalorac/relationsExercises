import com.sun.xml.internal.ws.api.ha.StickyFeature;

/**
 * Created by lotalorafox on 28/04/17.
 */
public abstract class Pet {
    protected String id;
    protected String name;
    protected String hairColor;

    public Pet(String id, String name, String hairColor) {
        this.id = id;
        this.name = name;
        this.hairColor = hairColor;
    }

    public String sound(){
        return null;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getHairColor() {
        return hairColor;
    }
}
