import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class InsertDelete {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        int size= sc.nextInt();
        for(int i=0;i<size;i++) {
            int input = sc.nextInt();
            list.add(input);
        }
        int noOfQuery = sc.nextInt();
        for(int i=0;i<noOfQuery;i++) {
            String queryType = sc.next();
            //System.out.println(i+" "+queryType);
            sc.nextLine();
            if (queryType.equalsIgnoreCase("Insert")) {
                int pos = sc.nextInt();
                int element = sc.nextInt();
                list.add(pos,element);
            }
            else if(queryType.equalsIgnoreCase("delete")) {
                int pos = sc.nextInt();
                list.remove(pos);
            }

        }
        System.out.println(list);
    }
}
