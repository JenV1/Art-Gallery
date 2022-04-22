import java.util.ArrayList;

public class Customer {

    String name;
    int wallet;
    ArrayList<String> collection = new ArrayList<>();

    public Customer() {
    }

    public Customer(String name, int wallet, ArrayList<String> collection) {
        this.name = name;
        this.wallet = wallet;
        this.collection = collection;
    }

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

    public ArrayList<String> getCollection() {
        return collection;
    }

    public void setCollection(ArrayList<String> collection) {
        this.collection = collection;
    }

    public void buyArtwork(Gallery gallery, Artwork art) {
        int price = art.getPrice();
        String identifier = art.getNft();
        if (wallet >= price && gallery.getArtworks().contains(identifier)) {
            wallet -= price;
            gallery.setTill(gallery.getTill() + price);
        }
    }
}
