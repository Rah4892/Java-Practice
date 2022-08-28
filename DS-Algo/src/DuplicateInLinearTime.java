import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class DuplicateInLinearTime {
    public static void main(String[] args) {
        Integer[] arr = {247, 9, 303, 9, 304, 242, 44, 204, 291, 26, 242, 2, 358,
                264, 176, 289, 196, 329, 176, 102, 45, 111};

        HashSet<Integer> set = new HashSet<>();
        List<Integer> duplicates = new ArrayList<>();
        for(int i =0;i<arr.length;i++) {
            if(!set.contains(arr[i])) {
                set.add(arr[i]);
            }
            else {
                duplicates.add(arr[i]);
            }
        }


        System.out.println(duplicates);
    }
}


