package CarRep;

import java.util.ArrayList;
import java.util.List;

public class Master extends Person {
    public static List<Master> masterList = new ArrayList<>();
    private final String payhour;

    public Master(long id, String lastName, String firstName, String patronymic, String payhour) {
        super(id, lastName, firstName, patronymic);
        this.payhour = payhour;
    }

    public String getPayHour() {
        return payhour;
    }
}
