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
        assertEquals(0, tdd.findByCycle(new int[][]
                {{4, 5, 6},
                {1, 2, 3},
                {3,2, 1}}));
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
        assertEquals(0, tdd.findByCycle(new int[][]
                {{4, 5, 6},
                {1, 2, 3},
                {3,2, 1}}));
    }
}