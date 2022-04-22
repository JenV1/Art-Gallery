public class Artwork {
    String title;
    int price;
    String nft;
    // nft is the unique identifier of each artwork
    Artist artist;

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
    }

    public Artwork() {
    }
}
