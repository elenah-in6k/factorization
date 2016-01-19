import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static java.util.Arrays.asList;

/**
 * Created by elenahayfullina on 1/19/16.
 */
public  class Factorization {
    static List<Integer>  multipliers = new ArrayList<Integer>();
    public static List<Integer> getMultipliers(int number) {
if (number > 1) {
    if (number % 2 == 0) {
        multipliers.add(2);
        getMultipliers(number / 2);
    } else if (number % 3 == 0) {
        multipliers.add(3);
        getMultipliers(number / 3);
    } else {
        multipliers.add(number);
    }
}
        return multipliers;
    }
}
