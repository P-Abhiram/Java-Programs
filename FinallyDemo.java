public class FinallyDemo {
    public static void main(String[] args) {
        try {
            String st;
            st="Abhiram";
            System.out.println(st.length());
        } catch (NullPointerException e) {
            System.out.println("We cant find length of string");
            
        }
        finally{
            System.out.println("Code for closing file,releasing network,database etc");
            System.out.println("This Block executes always");
        }
    }
}
