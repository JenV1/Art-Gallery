import java.util.ArrayList;

public class Artist {

    String name;
    ArrayList<String> works = new ArrayList<String>();
    // art stored by their unique nft identifier

    public Artist() {
    }

    public Artist(String name, ArrayList<String> works) {
        this.name = name;
        this.works = works;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<String> getWorks() {
        return works;
    }

    public void setWorks(ArrayList<String> works) {
        this.works = works;
    }
}
