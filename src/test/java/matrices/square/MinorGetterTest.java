import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class MinorGetterTest {

    MinorGetter mg1 = new MinorGetter(new int[][]
            {{45, 32, -7},
            {80, 13, -24},
            {63, -5, 6}},
            0);

    MinorGetter mg2 = new MinorGetter(new int[][]
            {{0, 1, 2, 3, 4, 5},
            {6, 7, 8, 9, 10, 11},
            {12, 13, 14, 15, 16, 17},
            {18, 19, 20, 21, 22, 23},
            {24, 25, 26, 27, 28, 29},
            {30, 31, 32, 33, 34, 35}},
            2);

    @Test
    public void getMinor() {
        Assertions.assertArrayEquals(
                new int[][]{{13, -24}, {-5, 6}},
                mg1.getMinor());
        Assertions.assertArrayEquals(
                new int[][]
                        {{1, 2, 3, 4, 5},
                        {7, 8, 9, 10, 11},
                        {19, 20, 21, 22, 23},
                        {25, 26, 27, 28, 29},
                        {31, 32, 33, 34, 35}},
                mg2.getMinor());
    }
}