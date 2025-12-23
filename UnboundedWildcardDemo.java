import java.util.ArrayList;
import java.util.List;
public class UnboundedWildcardDemo {
    public static void printList(List<?> list){
        for(Object elem : list){
            System.out.println(elem);
        }
    }
    public static void main(String[] args) {
        List<String> stringList = new ArrayList<>();
        stringList.add("Hello");
        stringList.add("World");

        List<Integer> intList = new ArrayList<>();
        intList.add(1);
        intList.add(2);

        List<Double> dlist= new ArrayList<>();
        dlist.add(32.3);
        dlist.add(43333.432);

        printList(stringList);
        printList(intList);
        printList(dlist);

    }
}
