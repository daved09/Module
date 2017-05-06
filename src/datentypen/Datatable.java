package datentypen;

/**
 * Created by david on 30.01.17.
 */
public class Datatable {
    private final String version = "0.2";
    private int capacity;
    private int index;
    private Data[] data;

    public Datatable()
    {
        this(20);
    }

    public Datatable(int capacity)
    {
        setCapacity(capacity);
        initData();
    }

    public void addItem(String name,String value)
    {
        data[index] = new Data(index,name,value);
        index++;
    }

    public Object getItemById(int id)
    {
        Object value = null;
        for(Data entry : data)
        {
            if(entry.getId()==id)
            {
                value = entry.getValue();
                break;
            }
        }
        return value;
    }

    public Object getItemByName(String name)
    {
        Object value = null;
        for (Data entry : data)
        {
            if(entry.getName().equals(name))
            {
                value = entry.getValue();
                break;
            }
        }
        return value;
    }

    private void initData()
    {
        data = new Data[capacity];
    }

    public int getCapacity() {
        return capacity;
    }

    private void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public String getVersion() {
        return version;
    }
}
