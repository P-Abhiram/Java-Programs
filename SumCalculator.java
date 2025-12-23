public class SumCalculator {
    public static void main(String[] args) {
        int sum=0;
        if(args.length==0){
            System.out.println("Pass numbers as Arguments");
            return;
        }
        for(String a :args){
            try{
            int num =Integer.parseInt(a);
            sum=sum+num;
            }catch(NumberFormatException e){
                System.out.println("Invalid argument");
            }
            
        }
        System.out.println("Sum = "+sum);
    } 
}
