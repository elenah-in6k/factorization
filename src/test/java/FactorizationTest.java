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

        factorization(4, asList(2, 2));

        factorization(6, asList(2, 3));

        factorization(8, asList(2, 2, 2));

        factorization(10, asList(2, 5));

        factorization(15, asList(3, 5));

        factorization(25, asList(5, 5));
    }

    void factorization(int number, List<Integer> multipliers ) {
        Factorization factorization = new Factorization();

        assertThat(factorization.getMultipliers(number), is(multipliers));
    }
}
