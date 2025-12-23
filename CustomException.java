class WeightLimitExceeded extends Exception{

    WeightLimitExceeded(int x) {
        System.out.println(Math.abs(30-x) +"kg :excess weight");
        System.out.println("Sorry you cannot fly-pay extra charges");
        }
    }
public class CustomException {
    void ValidateWeight(int weight) throws WeightLimitExceeded{
        if(weight>30)
            throw new WeightLimitExceeded(weight);
        else
            System.out.println("You can fly");
        
    }
    public static void main(String[] args) {
        CustomException ob=new CustomException();
        try{
            ob.ValidateWeight(40);
        }
        catch(WeightLimitExceeded e){
            System.out.println(e);
        }
    

    }
}
