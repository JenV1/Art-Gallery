import java.util.ArrayList;
import java.util.List;

public class Gallery {
    String name;
    int till;
    List<String> artworks = new ArrayList<>();

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

    public List<String> getArtworks() {
        return artworks;
    }

    public void setArtworks(List<String> artworks) {
        this.artworks = artworks;
    }

    public Gallery(String name, int till, List<String> artworks) {
        this.name = name;
        this.till = till;
        this.artworks = artworks;
    }

    public Gallery() {
    }
}
