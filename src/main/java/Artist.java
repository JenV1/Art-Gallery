import java.util.ArrayList;

public class Artist {

    private String name;
    private ArrayList<Artwork> works = new ArrayList<Artwork>();

    public Artist() {
    }

    public Artist(String name) {
        this.name = name;
        this.works = new ArrayList<Artwork>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<Artwork> getWorks() {
        return works;
    }

    public void setWorks(ArrayList<Artwork> works) {
        this.works = works;
    }

    public Artist(String name, ArrayList<Artwork> works) {
        this.name = name;
        this.works = works;
    }
}
