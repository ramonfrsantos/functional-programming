import java.util.Arrays;
import java.util.List;

public class FP04Structured {
    public static void main(String[] args) throws Exception {
        // printAllNumbersInListStructured(Arrays.asList(12, 13, 14, 15, 16, 17, 18));
        printEvenNumbersInListStructured(Arrays.asList(12, 13, 14, 15, 16, 17, 18));
    }

    // private static void printAllNumbersInListStructured(List<Integer> numbers){
    //     //functional prog
    //     numbers.stream()
    //         .forEach(System.out::println);
    // }

    // private static boolean isEven(int number){
    //     return number % 2 == 0;
    // }

    private static void printEvenNumbersInListStructured(List<Integer> numbers){
        //functional prog
        numbers.stream()
            .filter(number -> number%2 == 0)
            .forEach(System.out::println);
    }

}
