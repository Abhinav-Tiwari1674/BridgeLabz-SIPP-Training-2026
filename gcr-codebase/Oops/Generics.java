
class Fruit {
    public String getFruitName() {
        return "Fruit";
    }
}
class Apple extends Fruit {
    @Override
    public String getFruitName() {
        return "Apple";
    }
}
public class Generics<T> {
    private T value;
    
    public Generics(T value){
        this.value = value;
    }
    
    public T getValue(){
        return value;
    }
    
    public void setValue(T value){
        this.value = value;
    }
   
    public static void printGeneric(Generics<?> obj) {
        System.out.println("Unbounded Wildcard: " + obj.getValue());
    }
    
    public static void printFruit(Generics<? extends Fruit> obj) {
        System.out.println("Upper Bounded (? extends Fruit): " + obj.getValue().getFruitName());
    }
    
    public static void main(String[] args) {
        System.out.println("--- Box with Fruit and Apple ---");
        Generics<Fruit> box = new Generics<>(new Fruit());
        System.out.println("Box value: " + box.getValue().getFruitName());
        box.setValue(new Apple());
        System.out.println("After setting Apple: " + box.getValue().getFruitName());
        Generics<Apple> appleBox = new Generics<>(new Apple());
        printFruit(appleBox);
        
      
}
}
