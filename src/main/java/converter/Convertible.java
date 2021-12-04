public interface Convertible {

    int convert(int sourceScale, boolean direction);

    default int[] convert(int[] sourceScale, boolean direction) {
        if(sourceScale.length != 2) {
            return null;
        }
        int[] result = new int[2];
        result[0] = convert(sourceScale[0], direction);
        result[1] = convert(sourceScale[1], direction);
        return result;
    }

}
