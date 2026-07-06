class Person {
    String name;
    int id;

    public Person(String name, int id) {
        this.name = name;
        this.id = id;
    }
}

interface Worker {
    void performDuties();
}

class Chef extends Person implements Worker {

    public Chef(String name, int id) {
        super(name, id);
    }

    @Override
    public void performDuties() {
        System.out.println(name + " is preparing food.");
    }
}

class Waiter extends Person implements Worker {

    public Waiter(String name, int id) {
        super(name, id);
    }

    @Override
    public void performDuties() {
        System.out.println(name + " is serving customers.");
    }
}

public class RestaurantManagementSystem {
    public static void main(String[] args) {

        Chef chef = new Chef("Amit", 101);
        Waiter waiter = new Waiter("Rahul", 102);

        chef.performDuties();
        waiter.performDuties();
    }
}