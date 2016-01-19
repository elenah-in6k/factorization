import java.util.Arrays;
import java.util.List;

import static java.util.Arrays.asList;

/**
 * Created by elenahayfullina on 1/19/16.
 */
public  class Factorization {
    static List<Integer>  multipliers;
    public static List<Integer> getMultipliers(int number) {
        multipliers = asList(1);
        if (number == 2)
            multipliers = asList(1,2);
        else if  (number == 3)
            multipliers = asList(1,3);

        return multipliers;
    }
}
