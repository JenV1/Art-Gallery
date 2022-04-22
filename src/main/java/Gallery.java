import java.util.ArrayList;

public class Gallery {
    String name;
    int till;
    ArrayList<String> artworks = new ArrayList<String>();

    public Gallery() {
    }

    public Gallery(String name, int till, ArrayList<String> artworks) {
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

    public ArrayList<String> getArtworks() {
        return artworks;
    }

    public void setArtworks(ArrayList<String> artworks) {
        this.artworks = artworks;
    }
}
