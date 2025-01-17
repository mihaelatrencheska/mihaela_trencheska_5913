
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<Integer> initialListOfNumbers = Arrays.asList(1,4,5,8);
        System.out.println("demonstrations of map method: ");
        List<Integer>square = initialListOfNumbers.stream().map(x-> x*x)
                .collect(Collectors.toList());
        System.out.println(square);
    }
}