import org.junit.Test;

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
        List<Integer> multipliers = Arrays.asList(1);
        factorization(1, multipliers);
    }

     void factorization(int number, List<Integer> multipliers ) {
        assertThat(Factorization.getMultipliers(number), is(multipliers));

    }
}
