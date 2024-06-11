import org.junit.jupiter.api.Test;
import java.util.Arrays;
import java.util.List;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class NumberOperationsTest {

    @Test
    public void testMin() {
        List<Integer> numbers = Arrays.asList(1, 4, 2, 3);
        assertEquals(1, NumberOperations._min(numbers));
    }

    @Test
    public void testMax() {
        List<Integer> numbers = Arrays.asList(1, 4, 2, 3);
        assertEquals(4, NumberOperations._max(numbers));
    }

    @Test
    public void testSum() {
        List<Integer> numbers = Arrays.asList(1, 4, 2, 3);
        assertEquals(10, NumberOperations._sum(numbers));
    }

    @Test
    public void testMult() {
        List<Integer> numbers = Arrays.asList(1, 4, 2, 3);
        assertEquals(24, NumberOperations._mult(numbers));
    }

    @Test
    public void testPerformance() {
        int size = 1_000_000;
        Integer[] largeArray = new Integer[size];
        Arrays.fill(largeArray, 1);
        List<Integer> numbers = Arrays.asList(largeArray);

        long startTime, endTime;

        startTime = System.currentTimeMillis();
        NumberOperations._min(numbers);
        endTime = System.currentTimeMillis();
        System.out.println("Performance test for _min duration: " + (endTime - startTime) + " ms");

        startTime = System.currentTimeMillis();
        NumberOperations._max(numbers);
        endTime = System.currentTimeMillis();
        System.out.println("Performance test for _max duration: " + (endTime - startTime) + " ms");

        startTime = System.currentTimeMillis();
        NumberOperations._sum(numbers);
        endTime = System.currentTimeMillis();
        System.out.println("Performance test for _sum duration: " + (endTime - startTime) + " ms");

        startTime = System.currentTimeMillis();
        NumberOperations._mult(numbers);
        endTime = System.currentTimeMillis();
        System.out.println("Performance test for _mult duration: " + (endTime - startTime) + " ms");
    }
}
