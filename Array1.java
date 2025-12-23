
import java.util.Arrays;

public class Array1{
    public static void main(String[] args){
        int [] num ={20,50,60,30,10,40,90,80,100,70};
        String [] cars = {"Hyundai","Maruti","Tata","kia","ford"};
        System.out.println(num.length);
        System.out.println(cars.length);
        Arrays.sort(num);
        Arrays.sort(cars);
        for(int i : num)
        {
            System.out.println(i);
        }
    }
}