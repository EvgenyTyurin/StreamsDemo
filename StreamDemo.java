import java.util.Arrays;

/**
 * Show use of streams
 */

public class StreamDemo {

    public static void main(String[] args) {
        int[] array = {1,2,3,4};
        // Show all
        Arrays.stream(array).forEach(i -> System.out.println(i));
        // Show sum of all
        System.out.println("Sum=" + Arrays.stream(array).sum());
        // Show max in array
        System.out.println("Max=" + Arrays.stream(array).max());
        // Show only even
        Arrays.stream(array)
                .filter(i -> (i % 2 == 0))
                .forEach(System.out::println); // method reference instead of lambda
    }

}
