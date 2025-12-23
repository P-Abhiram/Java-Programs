import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;

public class LowerBound {
    public static void printList(List<?> list) {
        for (Object obj : list) {
            System.out.println(obj);
        }
    }

    public static void main(String[] args) {
        List<Integer> intList = Arrays.asList(10, 20, 30);
        List<Number> numList = Arrays.asList(1.5, 2.5, 3.5);
        List<Object> objList = Arrays.asList("Hello", 100, 3.14);

        System.out.println("Integer list:");
        printList(intList);

        System.out.println("Number list:");
        printList(numList);

        System.out.println("Object list:");
        printList(objList);
    }
}
