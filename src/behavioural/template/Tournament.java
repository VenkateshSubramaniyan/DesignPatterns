package behavioural.template;


import java.util.ArrayList;
import java.util.List;

public class Tournament {

    private String name;
    private List<Request> accepted;

    public Tournament(String name) {
        accepted = new ArrayList<>();
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public List<Request> getAccepted() {
        return accepted;
    }

    public void register (Request request) {
        accepted.add(request);
    }

}
