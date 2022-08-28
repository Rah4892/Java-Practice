import java.util.ArrayList;
import java.util.List;

public class ArrayListsdemo {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(17);
        list.add(5);
        list.add(3);
        list.toArray();
        System.out.println(list);
        int[] result = new int[list.size()];
        for(int i=0;i<list.size();i++) {
            result[i] = list.get(i);
        }
        System.out.println(result[0]);
    }
}
