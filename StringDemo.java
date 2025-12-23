public class StringDemo
{
    public static void main(String [] args)
    {
        String s1 = "Hello World";
        String s2="hello World";
        String s3="great";
        int len  = s1.length(); 
        System.out.println("length of "+ s1 + " is " + len);
        char firstChar = s1.charAt(0); 
        System.out.println("First character of  "+ s1 +" is " + firstChar);
        String sub1 = s1.substring(3); 
         System.out.println("sub string from index 3 of  "+ s1 +" is  " + sub1);
        String sub2 = s1.substring(0, 4); 
        System.out.println("sub string from index (0,4)  of  "+ s1 +" is " + sub2);
                

        boolean isEqual = s1.equals(s2); 
        System.out.println("s1 equals to s2  "+ isEqual);
        boolean isEqualIgnoreCase = s1.equalsIgnoreCase(s2);  
        System.out.println("s1 equals to s2  "+ isEqualIgnoreCase);
        int indexChar = s1.indexOf('l'); 
        System.out.println("index of l in s1  "+ indexChar);
        int indexStr = s1.indexOf("World"); 
        System.out.println("index of  World  in s1  "+ indexStr);

        boolean start= s1.startsWith("Hel"); // true
        System.out.println("s1 start with Hel "+ start);
        boolean end = s1.endsWith("World"); 
        System.out.println("s1 end with World "+ end);
        String news1 = s1.replace('l', 'o'); 
        System.out.println("new string after replacing l with o "+ news1);
        String replaceds1 = s1.replace("World", "java"); 
        System.out.println("new string after replacing world with java  "+ replaceds1);
        String lower = s1.toLowerCase(); 
        System.out.println("s1 in lower case "+ lower);
        String upper = s1.toUpperCase(); 
        System.out.println("s1 in upper case "+ upper);  
        String combined = s1.concat(s3); 
        System.out.println("s1 & s3 cobined string "+ combined);
        String text = "  padded  ";
        String trimmed = text.trim(); // trimmed will be "padded"
        String data = "apple,banana,orange";
        String[] fruits = data.split(","); // fruits will be {"apple", "banana", "orange"};
        for (String x: fruits)
         System.out.println(x);
    }
}