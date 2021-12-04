public class RangeParser{

    int[] parseArray(String range) {
        int[] arr = new int[2];
        StringBuilder val1 = new StringBuilder();
        StringBuilder val2 = new StringBuilder();
        int ind = 0;
        try{
            while(ind < range.length() && range.charAt(ind) != '-') {
                val1.append(range.charAt(ind++));
            }
            while(++ind < range.length()) {
                val2.append(range.charAt(ind));
            }
            arr[0] = Integer.parseInt(val1.toString());
            arr[1] = Integer.parseInt(val2.toString());
        } catch (NumberFormatException numEx){

        }
        return null;
    }
}
