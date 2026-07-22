

@FunctionalInterface
interface MyFunctionalInterface {
    void myMethod();
}


public class Functionalinterface {
    public static void main(String[] args) {
        MyFunctionalInterface funcInterface = () -> System.out.println("Hello from MyFunctionalInterface!");
        funcInterface.myMethod();
        
    }
}

