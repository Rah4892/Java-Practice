public class MinMax {
    public static void main(String[] args) {
        int[] arr = {1,4,99,10000,-67};
        int max = 999999;
        int min = 999999;
        for(int i=0;i<arr.length;i++) {
            if (max < arr[i])
                max = arr[i];
            if (min > arr[i])
                min = arr[i];
        }
        System.out.println("min="+min + " " + "max = " + max);
    }
}
