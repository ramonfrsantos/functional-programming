import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.function.Predicate;

public class FP06Structured {
   
    public static void main(String[] args){
        List<String> fruits = Arrays.asList("banana", "mango", "apple");

        Predicate<? super String> predicate = fruit -> fruit.startsWith("c");
        Optional<String> optional = fruits.stream().filter(predicate).findFirst();

        System.out.println(optional);
        System.out.println(optional.isPresent());
        System.out.println(optional.get());
    }
}
