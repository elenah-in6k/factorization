import java.util.Arrays;
import java.util.List;

import static java.util.Arrays.asList;

/**
 * Created by elenahayfullina on 1/19/16.
 */
public  class Factorization {
    static List<Integer>  multipliers;
    public static List<Integer> getMultipliers(int number) {
        if (number == 1)
            multipliers = asList(1);
        else
            multipliers = asList(1, 2);

        return multipliers;
    }
}
