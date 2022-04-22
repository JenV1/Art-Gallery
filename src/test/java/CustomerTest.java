import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class CustomerTest {

    Gallery gallery = new Gallery("Art Palace", 1000, new ArrayList<Artwork>());

    Artist daVinci = new Artist("Da Vinci", new ArrayList<>());

    Artwork piece1 = new Artwork("sunset", 10000, "nft1", daVinci);
    Artwork piece2 = new Artwork("beauty", 500, "nft2", daVinci);

    Customer customer1 = new Customer("Joey", 1000, new ArrayList<Artwork>());

    @Test
    @DisplayName("enough money, exists")
    void buyArtwork_money_exists() {
        gallery.getArtworks().add(piece1);
        gallery.getArtworks().add(piece2);
        customer1.buyArtwork(gallery, piece2);
        assertEquals(500, customer1.getWallet());
        assertEquals(1500, gallery.getTill());
        assertTrue(customer1.getCollection().contains(piece2));
        assertFalse(gallery.getArtworks().contains(piece2));

    }

    @Test
    @DisplayName("enough money, doesn't exist")
    void buyArtwork_does_not_exist() {
        gallery.getArtworks().add(piece1);
        customer1.buyArtwork(gallery, piece2);
        assertEquals(1000, customer1.getWallet());
        assertEquals(1000, gallery.getTill());
        assertFalse(customer1.getCollection().contains(piece2));
    }

    @Test
    @DisplayName("not enough money, does exist")
    void buyArtwork_not_enough_money() {
        gallery.getArtworks().add(piece1);
        customer1.buyArtwork(gallery, piece1);
        assertEquals(1000, customer1.getWallet());
        assertEquals(1000, gallery.getTill());
        assertFalse(customer1.getCollection().contains(piece2));
    }
}