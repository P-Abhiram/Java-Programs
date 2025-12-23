public class StringBufferExample {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer("Hello");

        // Appending
        sb.append(" World");
        System.out.println(sb); // Output: Hello World

        // Inserting
        sb.insert(6, "Java ");
        System.out.println(sb); // Output: Hello Java World

        // Replacing
        sb.replace(6, 10, "Beautiful");
        System.out.println(sb); // Output: Hello Beautiful World

        // Deleting
        sb.delete(5, 15);
        System.out.println(sb); // Output: Hello World
    }
}