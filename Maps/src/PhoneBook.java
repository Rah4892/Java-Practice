import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class PhoneBook {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n=in.nextInt();
        in.nextLine();
        Map<String, Integer> phoneBook = new HashMap<>();

        for(int i=0;i<n;i++)
        {
            String name=in.nextLine();
            int phone=in.nextInt();
            phoneBook.put(name, phone);
            in.nextLine();
        }
        while (in.hasNext()) {
            String query = in.nextLine();
            if (!phoneBook.containsKey(query)) {
                System.out.println("Not found");
            }
            else {
                System.out.println(query+"="+ phoneBook.get(query));
            }
        }

        //System.out.println(phoneBook);
    }
}
