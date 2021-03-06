import java.util.ArrayList;

public class Gallery {
    private String name;
    private int till;
    private ArrayList<Artwork> artworks = new ArrayList<Artwork>();

    public Gallery() {
    }

    public Gallery(String name, int till) {
        this.name = name;
        this.till = till;
        this.artworks = new ArrayList<Artwork>();
    }

    public Gallery(String name, int till, ArrayList<Artwork> artworks) {
        this.name = name;
        this.till = till;
        this.artworks = artworks;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getTill() {
        return till;
    }

    public void setTill(int till) {
        this.till = till;
    }

    public ArrayList<Artwork> getArtworks() {
        return artworks;
    }

    public void setArtworks(ArrayList<Artwork> artworks) {
        this.artworks = artworks;
    }

    public int stock_take() {
        int length = artworks.size();
        int total = 0;

        for (int i=0; i<length; i++) {
            total += artworks.get(i).getPrice();
        }

        return total;
    }
}
