package stream.pojo;

/**
 * Created by tang on 2015/12/10.
 */
public class Transaction {
    public static int GROCERY=1;
    private int type;
    private Double value;
    private int id;

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    public Double getValue() {
        return value;
    }

    public void setValue(Double value) {
        this.value = value;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
