import java.util.List;
import java.util.ArrayList;

public class UpperBoundedWildcard {
    public static double sumOfList(List<? extends Number> list){
        double sum=0.0;
        for(Number number : list){
            sum+= number.doubleValue();
        }
        return sum;
    }
    public static void main(String[]args){
        List<Integer> intList = new ArrayList<>();
        intList.add(1);
        intList.add(2);
        intList.add(3);
        List<Double> dList = new ArrayList<>();
        dList.add(1.1);
        dList.add(2.1);
        dList.add(3.1);

        System.out.println("Sum of intList: "+ sumOfList(intList));
        System.out.println("Sum of DoubleList: "+ sumOfList(dList));
    }
}
