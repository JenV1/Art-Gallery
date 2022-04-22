import java.util.ArrayList;
import java.util.List;

public class Artist {

    String name;
    List<String> works = new ArrayList();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<String> getWorks() {
        return works;
    }

    public void setWorks(List<String> works) {
        this.works = works;
    }

    public Artist(String name, List<String> works) {
        this.name = name;
        this.works = works;
    }

    public Artist() {
    }
}
