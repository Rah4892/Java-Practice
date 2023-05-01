import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class RepeatedNos {
    public static void main(String[] args) {
        List<Integer> numList = Arrays.asList(2,3,4,2,1,2,3,43,2);

        Map<Integer, Long> map = numList.stream().collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

        map.forEach((key, value) -> System.out.println(key + "->" + value));
    }
}
