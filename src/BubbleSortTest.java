import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class BubbleSortTest {
    BubbleSort bubbleSort;

    @Test
    public void testSimpleArraySort(){
        List<Double> input =  Arrays.asList(new Double[]{1.,4.,5.,6.,8.,3.,8.});
        List<Double> expected =  Arrays.asList(new Double[]{1.,3.,4.,5.,6.,8.,8.});
        assertEquals(expected,bubbleSort.sort(input));
    }

    @Test
    public void testEmptyArraySort(){
        List<Double> input =  Arrays.asList(new Double[]{});
        List<Double> expected =  Arrays.asList(new Double[]{});
        assertEquals(expected,bubbleSort.sort(input));
    }

    @Test
    public void testArrayWithNegativesSort(){
        List<Double> input      =  Arrays.asList(new Double[]{-9.3,0.2,4.,0.1,5.,9.});
        List<Double> expected   =  Arrays.asList(new Double[]{-9.3,0.1,0.2,4.,5.,9.});
        assertEquals(expected,bubbleSort.sort(input));
    }

    @Test
    public void testFirstElementIsNullSort(){
        List<Double> input =  new ArrayList<Double>();input.add(null);input.add(5.0001);
        List<Double> expected =  new ArrayList<Double>();expected.add(5.0001);
        assertEquals(expected,bubbleSort.sort(input));
    }

    @Test
    public void testLastElementIsNullSort(){
        List<Double> input =  new ArrayList<Double>();input.add(5.0001);input.add(null);
        List<Double> expected =  new ArrayList<Double>();expected.add(5.0001);
        assertEquals(expected,bubbleSort.sort(input));
    }

    @Test
    public void testFirstElementIsNullInBiggerListSort(){
        List<Double> input =  new ArrayList<Double>();input.add(null);input.add(15.0001);input.add(5.0001);
        List<Double> expected =  new ArrayList<Double>();expected.add(5.0001);expected.add(15.0001);
        assertEquals(expected,bubbleSort.sort(input));
    }

    @Test
    public void testOneElementInTheCenterOfTheListIsNullSort(){
        List<Double> input =  new ArrayList<Double>();input.add(15.0001);input.add(null);input.add(5.0001);
        List<Double> expected =  new ArrayList<Double>();expected.add(5.0001);expected.add(15.0001);
        assertEquals(expected,bubbleSort.sort(input));
    }

    @Test
    public void testNullArraySortWithExceptionAsAResult() {
        final List<Double> input = null;

        RuntimeException exception = assertThrows(RuntimeException.class, () -> {
            bubbleSort.sort(input);
        });
        assertEquals("Input is NULL", exception.getMessage());
    }

}
