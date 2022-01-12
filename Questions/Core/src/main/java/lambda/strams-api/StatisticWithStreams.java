import java.util.*;

public class StatisticWithStreams {
    private static Collection<Integer> integers;

    public static void main(String[] args) {
        fillArrayList();

    }

    private static void checkList(String listType) {
        System.out.println(String.format("Minimum of %s is ", listType) + integers.stream().mapToInt(i -> i).summaryStatistics().getMin());
        System.out.println(String.format("Maximum of %s is ", listType) + integers.stream().mapToInt(i -> i).summaryStatistics().getMax());
        System.out.println(String.format("Count of %s is ", listType) + integers.stream().mapToInt(i -> i).summaryStatistics().getCount());
        System.out.println(String.format("Sum of %s is ", listType) + integers.stream().mapToInt(i -> i).summaryStatistics().getSum());
        System.out.println(String.format("Average of %s is ", listType) + integers.stream().mapToInt(i -> i).summaryStatistics().getAverage());
    }

    private static void fillArrayList() {
        integers = new ArrayList<>();
        fillList();
        checkList("ArrayList");
        integers = new LinkedList<>();
        fillList();
        checkList("LinkedList");
        integers = new HashSet<>();
        fillList();
        checkList("HashSet");
    }

    private static void fillList() {
        for(int i = 0; i < 1_000_000; i++) {
            if(!integers.add(i)) System.out.println("Не получилось добавить " + i);
        }
        for(int i = 0; i < 10; i++) {
            int rnd = new Random().nextInt(2_000_000);
            if(!integers.add(rnd)) System.out.println("Не получилось добавить " + rnd);
        }
    }
}
