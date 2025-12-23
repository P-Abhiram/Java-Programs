class Pair<T, U> {
    private T firstItem;
    private U secondItem;

    public Pair(T firstItem, U secondItem) {
        this.firstItem = firstItem;
        this.secondItem = secondItem;
    }

    public void displayPair() {
        System.out.println("First Item: " + firstItem + " (Type: " + firstItem.getClass().getName() + ")");
        System.out.println("Second Item: " + secondItem + " (Type: " + secondItem.getClass().getName() + ")");
    }
}

public class GenericPairDemo {
    public static void main(String[] args) {
        Pair<String, Integer> personAge = new Pair<>("Alice", 30);
        System.out.println("--- Person Age Pair ---");
        personAge.displayPair();

        Pair<Double, Boolean> sensorStatus = new Pair<>(98.6, true);
        System.out.println("--- Sensor Status Pair ---");
        sensorStatus.displayPair();

        Pair<String, Integer> personName = new Pair<>("Abhi", 19);
        System.out.println("--- Person Name Pair ---");
        personName.displayPair();
    }
}
