import java.util.ArrayList;
import java.util.List;

public class Customer {

    String name;
    int wallet;
    List<String> collection = new ArrayList<>();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getWallet() {
        return wallet;
    }

    public void setWallet(int wallet) {
        this.wallet = wallet;
    }

    public List<String> getCollection() {
        return collection;
    }

    public void setCollection(List<String> collection) {
        this.collection = collection;
    }

    public Customer(String name, int wallet, List<String> collection) {
        this.name = name;
        this.wallet = wallet;
        this.collection = collection;
    }

    public Customer() {
    }
}
