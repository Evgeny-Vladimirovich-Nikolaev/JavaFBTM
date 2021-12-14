public class StringArrayParser {

    private String[][] values;

    StringArrayParser(String[][] values) {
        this.values = values;
    }

    int countValues() throws MyArrayDataException {
        int res, i, j;
        res = i = j = 0;
        if (checkArray()) {
            try {
                for (i = 0; i < 4; i++) {
                    for (j = 0; j < 4; j++) {
                        res += Integer.parseInt(values[i][j]);
                    }
                }
            } catch (NumberFormatException exNum) {
                throw new MyArrayDataException(i, j, values[i][j], exNum);
            }
        }
        return res;
    }

    private boolean checkArray() {
        if (values.length != 4 || values[0].length != 4) {
            throw new MyArraySizeException(values.length, values[0].length);
        }
        return true;
    }
}
