import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {

        List<String> initialList = Arrays.asList("a", "b", "c");

        List<String>resultList = initialList.stream().map(str -> str.toUpperCase()).collect(Collectors.toList());
        resultList.stream().forEach(str-> System.out.println(str));

    }
}