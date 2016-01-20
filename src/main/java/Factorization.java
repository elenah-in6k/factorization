import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static java.util.Arrays.asList;

/**
 * Created by elenahayfullina on 1/19/16.
 */
public class Factorization {
    List<Integer> multipliers = new ArrayList<Integer>();

    public List<Integer> getMultipliers(int number) {
        int i = 2;

        while ((i <= number) && (number > 1)) {
            if (number % i == 0) {
                number = number / i;
                multipliers.add(i);
                getMultipliers(number);
            }
            i++;
        }

        return multipliers;
    }
}
