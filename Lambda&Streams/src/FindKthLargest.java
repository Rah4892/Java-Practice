import java.util.Arrays;
import java.util.List;

public class FindKthLargest {
    public static void main(String[] args) {
        List<Integer> empSalary = Arrays.asList(5000,10000, 6000, 8000, 9000);
        Integer result = Math.toIntExact(empSalary.stream().sorted((x, y) -> x - y).skip(2).findAny().get());
        System.out.println(result);
    }
}
