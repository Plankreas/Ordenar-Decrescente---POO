package ordenarDecrescente;

import java.util.ArrayList;
import java.util.Collections;

public class OrdenarDecescente {

    public static void main(String[] args) {
        ArrayList<String> cars = new ArrayList<>();
        cars.add("Volvo");
        cars.add("BMW");
        cars.add("Ford");
        cars.add("Mazda");

        Collections.sort(cars, Collections.reverseOrder());

        cars.forEach((i) -> {
            System.out.println(i);
        });
    }
}
