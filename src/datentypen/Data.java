package datentypen;

/**
 * Created by david on 30.01.17.
 */
public class Data {
    private String name;
    private Object value;
    private int id;

    public Data(int id,String name,String value)
    {
        setId(id);
        setName(name);
        setValue(value);
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Object getValue() {
        return value;
    }

    public void setValue(Object value) {
        this.value = value;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
