package OOP_Concepts;

import java.util.ArrayList;
import java.util.Arrays;

public class lists {
    public static void main(String[] args) {
        ArrayList<Places> lists = new ArrayList<>();
        lists.add(new Places("Mumbai","12/01/2021"));
        lists.add(new Places("Mumbai","12/01/2021"));
        lists.add(new Places("Mumbai","12/01/2021"));
        Places place = new Places();
        place.setPlace("Bombay");
        place.setDate("20/11/23");
        lists.add(place);
        System.out.println(lists);
    }
}
