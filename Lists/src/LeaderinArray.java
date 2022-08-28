import java.util.ArrayList;
import java.util.List;

public class LeaderinArray {
    public static void main(String[] args) {
        int[] A = {16,17,4,3,5,2};
        List<Integer> list = new ArrayList<Integer>();
        list.add(A[A.length - 1]);
        if (A.length == 1) {
           System.out.println(A[0]);
        }
        else if (A.length == 2) {
            if (A[0] > A[1]) {
                list.add(A[0], A[1]);
            }
        }
        else {
            int i=0;
            boolean flag = false;
            while(i<A.length-1) {
                for(int j=i+1;j<A.length-1;j++) {
                    if (A[i] > A[j]) {
                        flag = true;
                    }
                    else{
                        flag = false;
                        break;
                    }
                }
                if (!flag){
                    i++;
                } else{
                    list.add(A[i]);
                }
            }
        }
        System.out.println(list);
    }
    }





