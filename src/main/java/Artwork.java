import java.util.ArrayList;

public class Artwork {
    private String title;
    private int price;
    private String nft;
    // nft is the unique identifier of each artwork
    private Artist artist;

//    public void addToArtistCollection() {
//        artist.getWorks().add(nft);
//    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getNft() {
        return nft;
    }

    public void setNft(String nft) {
        this.nft = nft;
    }

    public Artist getArtist() {
        return artist;
    }

    public void setArtist(Artist artist) {
        this.artist = artist;
    }

    public Artwork(String title, int price, String nft, Artist artist) {
        this.title = title;
        this.price = price;
        this.nft = nft;
        this.artist = artist;
        this.artist.getWorks().add(this);

    }

    public Artwork() {
    }
}
