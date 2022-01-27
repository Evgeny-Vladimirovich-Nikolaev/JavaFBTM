import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TestDrivenDeterminantTest {

    TestDrivenDeterminant tdd = new TestDrivenDeterminant();

    @Test
    public void findBySeparateActions() {
        assertEquals(-8477, tdd.findBySeparateActions(new int[][]
                {{14, 11, -9},
                {18, -5, 16},
                {-17, 3, 19}}));
        assertEquals(2197, tdd.findBySeparateActions(new int[][]
                {{13, 13, 13},
                {0, 13, 13},
                {0, 0, 13}}));
        assertEquals(-144300, tdd.findBySeparateActions(new int[][]
                {{56, 25, 0},
                {5, -90, 35},
                {0, 42, 12}}));
    }

    @Test
    public void findByCycle() {
        assertEquals(-8477, tdd.findByCycle(new int[][]
                {{14, 11, -9},
                {18, -5, 16},
                {-17, 3, 19}}));
        assertEquals(2197, tdd.findByCycle(new int[][]
                {{13, 13, 13},
                {0, 13, 13},
                {0, 0, 13}}));
        assertEquals(-144300, tdd.findByCycle(new int[][]
                {{56, 25, 0},
                {5, -90, 35},
                {0, 42, 12}}));
    }
}