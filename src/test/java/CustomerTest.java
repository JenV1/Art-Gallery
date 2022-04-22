import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class CustomerTest {

    Gallery gallery;
    Artist daVinci;
    Artwork piece1;
    Artwork piece2;
    Customer customer1;

    @BeforeEach
    public void beforeAll() {
        gallery = new Gallery("Art Palace", 1000);

        daVinci = new Artist("Da Vinci");

        piece1 = new Artwork("sunset", 10000, daVinci);
        piece2 = new Artwork("beauty", 500, daVinci);

        customer1 = new Customer("Joey", 1000);

    }

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
        assertTrue(gallery.getArtworks().contains(piece1));
    }

    @Test
    @DisplayName("not enough money, does exist")
    void buyArtwork_not_enough_money() {
        gallery.getArtworks().add(piece1);
        customer1.buyArtwork(gallery, piece1);
        assertEquals(1000, customer1.getWallet());
        assertEquals(1000, gallery.getTill());
        assertFalse(customer1.getCollection().contains(piece2));
        assertTrue(gallery.getArtworks().contains(piece1));
    }

    @Test
    @DisplayName("not enough money, doesn't exist")
    void buyArtwork_not_enough_and_does_not_exist() {
        gallery.getArtworks().add(piece2);
        customer1.buyArtwork(gallery, piece1);
        assertEquals(1000, customer1.getWallet());
        assertEquals(1000, gallery.getTill());
        assertFalse(customer1.getCollection().contains(piece1));
        assertTrue(gallery.getArtworks().contains(piece2));
    }
}