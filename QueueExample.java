import java.util.LinkedList;
import java.util.Queue;

public class QueueExample {
    public static void main(String[] args) {
        Queue<String> myQueue= new LinkedList<>();

        myQueue.offer("Alice");
        myQueue.offer("Bob");
        myQueue.offer("Charlie");
        System.out.println("Queue after adding : " + myQueue);
        System.out.println("Head of the Queue : " + myQueue.peek());
        System.out.println("Queue after adding : " + myQueue);
        System.out.println("Removed element : " + myQueue.poll());  
        System.out.println("Queue after removing  : " + myQueue);
        System.out.println("Is Queue empty? : " + myQueue.isEmpty());

    }
}
