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

        factorization(1, asList(1));

        factorization(2, asList(1, 2));

        factorization(3, asList(1, 3));

        factorization(4, asList(2, 2));

        factorization(6, asList(2, 3));

        factorization(8, asList(2, 2, 2));
    }

     void factorization(int number, List<Integer> multipliers ) {
        assertThat(Factorization.getMultipliers(number), is(multipliers));

    }
}
