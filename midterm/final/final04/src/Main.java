import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        //method reference
        List<String>listOfStrings = Arrays.asList("m", "i","h","a");
        List<String>collect = listOfStrings.stream().map(String::toUpperCase).collect(Collectors.toList());
        System.out.println(collect);

        //lambda expression
        List<String> collect2 = listOfStrings.stream().map(x->x.toUpperCase()).collect(Collectors.toList());
        System.out.println(collect2);
    }
}