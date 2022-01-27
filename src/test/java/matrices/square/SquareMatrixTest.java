import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SquareMatrixTest {

    SquareMatrix sm = new SquareMatrix(0);

    @BeforeEach
    void setUp() {
    }

    @Test
    public void findDeterminant() {
        assertEquals(137, sm.findDeterminant(new int[][] {{137}}));
        assertEquals(-57101, sm.findDeterminant(new int[][]
                       {{45, 32, -7},
                       {80, 13, -24},
                       {63, -5, 6}}));
        assertEquals(107130590, sm.findDeterminant(new int[][]
                        {{41, 16, 29, 25, 37, 12},
                        {24, -7, -49, 53, 10, -11},
                        {-62, 19, 23, 63, -59, -61},
                        {4, 8, 13, 36, 9, 0},
                        {145, -15, 80, -84, -19, 29},
                        {-17, 27, 38, 44, 35, 6}}));
    }
}