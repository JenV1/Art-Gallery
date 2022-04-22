import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class GalleryTest {

    Gallery gallery;
    Artist daVinci;
    Artwork piece1;
    Artwork piece2;
    Customer customer1;
    Artwork piece3;

    @BeforeEach
    public void beforeAll() {
        gallery = new Gallery("Art Palace", 1000);

        daVinci = new Artist("Da Vinci");

        piece1 = new Artwork("sunset", 10000, daVinci);
        piece2 = new Artwork("beauty", 500, daVinci);
        piece3 = new Artwork("dots", 25, daVinci);

        customer1 = new Customer("Joey", 1000);

    }
    
    @Test
    @DisplayName("check price when one art piece in works")
    void stock_take_one_painting() {
        gallery.getArtworks().add(piece1);
        assertEquals(10000, gallery.stock_take());
    }

    @Test
    @DisplayName("check price when several art pieces in works")
    void stock_take_many_paintings() {
        gallery.getArtworks().add(piece1);
        gallery.getArtworks().add(piece2);
        gallery.getArtworks().add(piece3);
        assertEquals(10525, gallery.stock_take());
    }


}