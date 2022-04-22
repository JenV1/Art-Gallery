import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class GalleryTest {

    Gallery gallery = new Gallery("Art Palace", 1000, new ArrayList<Artwork>());

    Artist daVinci = new Artist("Da Vinci", new ArrayList<>());

    Artwork piece1 = new Artwork("sunset", 10000, daVinci);
    Artwork piece2 = new Artwork("beauty", 500, daVinci);
    Artwork piece3 = new Artwork("dots", 25, daVinci);

    Customer customer1 = new Customer("Joey", 1000, new ArrayList<Artwork>());


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