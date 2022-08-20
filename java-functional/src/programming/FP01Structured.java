import java.util.Arrays;
import java.util.List;

public class FP01Structured {
    public static void main(String[] args) throws Exception {
        printAllNumbersInListStructured(Arrays.asList(12, 13, 14, 15, 16, 17, 18));
    }

    private static void printAllNumbersInListStructured(List<Integer> numbers){
        //loop the numbers
        for(int number: numbers){
            System.out.println(number);
        }
    }

}
