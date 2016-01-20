import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static java.util.Arrays.asList;

/**
 * Created by elenahayfullina on 1/19/16.
 */
public  class Factorization {
     List<Integer>  multipliers = new ArrayList<Integer>();

    public  List<Integer> getMultipliers(int number) {
        if (number > 1) {
            if (number % 2 == 0) {
                number = number / 2;
                multipliers.add(2);
                getMultipliers(number);
            } else if (number % 3 == 0) {
                number = number / 3;
                multipliers.add(3);
                getMultipliers(number);
            } else if (number % 5 == 0) {
                number = number / 5;
                multipliers.add(5);
                getMultipliers(number);
            } else {
                multipliers.add(number);
            }
        }
        return multipliers;
    }
}
