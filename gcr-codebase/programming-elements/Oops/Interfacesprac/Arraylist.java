import java.util.ArrayList;
public class Arraylist {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("Apple");
        list.add("Banana");
        list.add("Cherry");
        System.out.println("ArrayList: " + list);
        list.remove("Banana");
        System.out.println("After removing Banana: " + list);
        System.out.println("Size of ArrayList: " + list.size());
        for(String fruit : list) {
            System.out.println(fruit);
        }
    }
}



