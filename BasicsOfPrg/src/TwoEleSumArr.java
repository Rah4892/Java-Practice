//Return the set of elements from array whose sum is equal a given number

import java.util.Hashtable;

public class TwoEleSumArr {
    public static void main(String[] args) {
        int arr[] = new int[]{5,10,7,8,4,6,2,3};

        int k = 15;
        //printIndex(arr, k);
        System.out.println(printSubArrays(arr, k));
    }

    private static void printIndex(int arr[], int k) {
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length-1;j++){
                if((arr[i] + arr[j]) == k) {
                    System.out.println(arr[i] +" "+ arr[j]);
                }
            }
        }
    }

    private static int printSubArrays(int arr[], int k) {
        //5,10,7,8,4,6,2,3
        Hashtable<Integer, Integer> table = new Hashtable<>();
        int currentSum = 0;
        int result = 0;
        table.put(0,1);
        for(int i=0;i<arr.length;i++) {
            currentSum += arr[i];

            int requiredSum = currentSum - k;

            if(table.containsKey(requiredSum)) {
                result += table.get(requiredSum);
            }

            if(table.containsKey(currentSum)) {
                table.put(currentSum, table.get(currentSum) +1);
            }
            else {
                table.put(currentSum, 1);
            }

            //table.put(currentSum, table.getOrDefault(currentSum, 0)+1);
        }
        return result;

    }
}
