public class StringBuilderExample {    public static void main(String[] args) {
        // Create a StringBuilder
        StringBuilder sb = new StringBuilder("Hello");

        // Append a string
        sb.append(" World");
        System.out.println("After append: " + sb); // Output: Hello World

        // Insert at a specific position
        sb.insert(6, "Java ");
        System.out.println("After insert: " + sb); // Output: Hello Java World

        // Replace a portion of the string
        sb.replace(0, 5, "Hi");
        System.out.println("After replace: " + sb); // Output: Hi Java World

        // Delete a portion of the string
        sb.delete(3, 8);
        System.out.println("After delete: " + sb); // Output: Hi World

        // Reverse the string
        sb.reverse();
        System.out.println("After reverse: " + sb); // Output: dlroW iH

        // Convert StringBuilder to String
        String finalString = sb.toString();
        System.out.println("Final String: " + finalString); // Output: dlroW iH
    }
}