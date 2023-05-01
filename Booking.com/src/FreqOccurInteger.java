import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class FreqOccurInteger {
    public static void main(String[] args) {
        int[] arr = {1,2,1,5,1,2,3,7,2};

        HashMap<Integer, Integer> countMap = new HashMap<>();
        for(int i=0;i <arr.length;i++) {
            if(countMap.containsKey(arr[i])) {
                int count = countMap.get(arr[i]);
                countMap.put(arr[i], count+1);
            }
            else
                countMap.put(arr[i], 1);
        }

        System.out.println(countMap);

        //to get all entries with frequency greater than 3
        for(HashMap.Entry<Integer, Integer> entry : countMap.entrySet()) {
            if(entry.getValue() >= 3) {
                System.out.println(entry.getKey());
            }
        }

        //to get the max occurring key
        Map.Entry<Integer, Integer> maxOccur = Collections.max(countMap.entrySet(), HashMap.Entry.comparingByValue());
        System.out.println(maxOccur.getKey());
    }
}
