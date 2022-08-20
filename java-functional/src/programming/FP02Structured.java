import java.util.Arrays;
import java.util.List;

public class FP02Structured {
    public static void main(String[] args) throws Exception {
        printAllNumbersInListStructured(Arrays.asList(12, 13, 14, 15, 16, 17, 18));
    }

    private static void print(int number){
        System.out.println(number);
    }

    private static void printAllNumbersInListStructured(List<Integer> numbers){
        //functional prog
        numbers.stream()
            .forEach(FP02Structured::print);

        //loop the numbers
        // for(int number: numbers){
        //     System.out.println(number);
        // }
    }

}
