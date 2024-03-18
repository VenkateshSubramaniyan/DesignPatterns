package behavioural.template;

import java.util.HashMap;
import java.util.Map;

public class SportsCenter {

    private Map<Tournament, Integer> reservations = new HashMap<>();

    public void reserve(Tournament tournament, int hours) {
        reservations.put(tournament, hours);
    }

    public Map<Tournament, Integer> getReservations() {
        return reservations;
    }
}
