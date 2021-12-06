public interface Convertible {

    int convert(int sourceScale);

    default int[] convert(int[] sourceScale) {
        if(sourceScale.length != 2) {
            throw new IllegalArgumentException("");
        }
        int[] result = new int[2];
        result[0] = convert(sourceScale[0]);
        result[1] = convert(sourceScale[1]);
        return result;
    }
}