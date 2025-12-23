public class Box<T> {
    private T t;
    public void  set(T t){
        this.t = t;
    }
    public T get(){
        return t;
    }
    public static void main(String[] args) {
        Box<Integer> integerBox = new Box<>();
        integerBox.set(10);

        Box<String> stringBox = new Box<>();
        stringBox.set("Hello World");

        System.out.println("Integer Value: "+integerBox.get());
        System.out.println("String : "+stringBox.get());
    }
}
