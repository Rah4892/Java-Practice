import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class MergeLists {
    public static void main(String args[]){
        LinkedList<Integer> list1 = new LinkedList<>();
        list1.add(1);
        list1.add(2);
        list1.add(3);
        list1.add(5);
        LinkedList<Integer> list2 = new LinkedList<Integer>();
        list2.add(1);
        list2.add(3);
        list2.add(4);
        LinkedList<Integer> list3 = new LinkedList<>();
        Iterator<Integer> itr1 = list1.iterator();
        Iterator<Integer> itr2 = list2.iterator();
        Iterator<Integer> itr3 = list3.iterator();

        while(true){
            if(!itr1.hasNext()){
                while(itr2.hasNext()){
                    list3.add(itr2.next());
                }
            }
            else if(!itr2.hasNext()){
                while(itr1.hasNext()){
                    list3.add(itr1.next());
                }
            }
            else{
                if(itr1.next() < itr2.next()){
                    list3.add(itr1.next());
                    itr1.next();
                }else if(itr1.next() == itr2.next()){
                    list3.add(itr1.next());
                    list3.add(itr2.next());
                    itr1.next();
                    itr2.next();
                }
                else{
                    list3.add(itr2.next());
                    itr2.next();
                }
            }
        }

       /* while(itr3.hasNext()){
            System.out.println(itr3.next());
        }*/

    }

}
