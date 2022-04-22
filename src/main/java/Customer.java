import java.util.ArrayList;

public class Customer {

    private String name;
    private int wallet;
    private ArrayList<Artwork> collection = new ArrayList<Artwork>();

    public Customer(String name, int wallet) {
        this.name = name;
        this.wallet = wallet;
        this.collection = new ArrayList<Artwork>();
    }

    public Customer() {
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

    public ArrayList<Artwork> getCollection() {
        return collection;
    }

    public void setCollection(ArrayList<Artwork> collection) {
        this.collection = collection;
    }

    public Customer(String name, int wallet, ArrayList<Artwork> collection) {
        this.name = name;
        this.wallet = wallet;
        this.collection = collection;
    }

    public void buyArtwork(Gallery gallery, Artwork art) {
        int price = art.getPrice();
        String identifier = art.getNft();
        if (wallet >= price && gallery.getArtworks().contains(art)) {
            wallet -= price;
            gallery.setTill(gallery.getTill() + price);
            collection.add(art);
            gallery.getArtworks().remove(art);
        }
    }
}
