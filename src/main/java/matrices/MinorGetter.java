public class MinorGetter {

    private int[][] sourceArray;
    private int[][] minor;
    private int columnElem;

    MinorGetter(int[][] sourceArray, int columnElem) {
        this.sourceArray = sourceArray;
        this.columnElem = columnElem;
        minor = new int[sourceArray.length - 1][sourceArray.length-1];
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
