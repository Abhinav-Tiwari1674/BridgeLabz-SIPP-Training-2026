import java.util.ArrayList;

class Stack<T> {

    ArrayList<T> list = new ArrayList<>();

    void push(T value) {
        list.add(value);
    }

    T pop() {
        if (list.isEmpty()) {
            return null;
        }
        return list.remove(list.size() - 1);
    }

    void display() {
        System.out.println(list);
    }
}
