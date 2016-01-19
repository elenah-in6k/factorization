import org.junit.Test;

import static java.util.Arrays.asList;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.List;

/**
 * Created by elenahayfullina on 1/19/16.
 */
public class FactorizationTest {
    @Test
    public void testFactorization() {
        List<Integer> multipliers = asList(1);
        factorization(1, multipliers);
        multipliers = asList(1, 2);
        factorization(2, multipliers);
    }

     void factorization(int number, List<Integer> multipliers ) {
        assertThat(Factorization.getMultipliers(number), is(multipliers));

    }
}
