import java.util.ArrayList;

class Repository<T> {

    ArrayList<T> data = new ArrayList<>();

    void add(T obj) {
        data.add(obj);
    }

    void display() {
        for (T i : data) {
            System.out.println(i);
        }
    }
}