public class MinorGetter {

    int[][] sourceArray;
    int[][] minor;
    int lines;
    int columnElem;

    MinorGetter(int[][] sourceArray, int columnElem) {
        this.sourceArray = sourceArray;
        this.columnElem = columnElem;
        this.lines = sourceArray.length;
        minor = new int[lines - 1][lines-1];
    }

    int[][] getMinor() {
        for(int srcRow = 0, destRow = 0; srcRow < sourceArray.length; srcRow++) {
            if(srcRow != columnElem) {
                System.arraycopy(sourceArray[srcRow], 1, minor[destRow++], 0, minor.length);
            }
        }
        return minor;
    }
}
