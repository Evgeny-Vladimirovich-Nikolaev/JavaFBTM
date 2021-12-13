public class StringArrayParser {

    private String[][] values;

    StringArrayParser(String[][] values) {
        this.values = values;
    }

    int countValues() throws MyArrayDataException {
        int res = 0;
        int i = 0;
        int j = 0;
        if(checkArray()) {
            try {
                for(;i < 4; i++) {
                    for(;j < 4; j++) {
                        int temp = Integer.parseInt(values[i][j]);
                        res += temp;
                    }
                }
            } catch(NumberFormatException exNum) {
                System.out.println(values[i][j] + " некорректное значение");
                System.out.println(exNum);
                throw new MyArrayDataException(i, j);
            }
        }
        return res;
    }

    private boolean checkArray() {
        if(values.length != 4 || values[0].length != 4) {
            throw new MyArraySizeException(values.length, values[0].length);
        }
        return true;
    }
 }
