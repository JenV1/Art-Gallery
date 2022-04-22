import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class ArtworkTest {

    Artist daVinci = new Artist("Davinci", new ArrayList<>());

    Artwork piece1 = new Artwork("sunset", 100, "nft1", daVinci);
    Artwork piece2 = new Artwork("beauty", 500, "nft2", daVinci);

    @Test
    @DisplayName("check piece1 and piece2 added to artist collection")
    void addToArtistCollection() {
        assertTrue(daVinci.getWorks().contains(piece1));
        assertTrue(daVinci.getWorks().contains(piece2));
    }
}