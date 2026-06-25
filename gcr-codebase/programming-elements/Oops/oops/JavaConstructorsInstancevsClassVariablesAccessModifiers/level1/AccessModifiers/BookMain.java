package JavaConstructorsInstancevsClassVariablesAccessModifiers.level1.AccessModifiers;

public class BookMain {
     public static void main(String[] args) {
        BookClass b = new BookClass("12345", "Java Basics", "James");
        b.showBook();
        b.setAuthor("James Gosling");
        System.out.println("Updated Author: " + b.getAuthor());

        EBookSubClass eb = new EBookSubClass("67890", "Python Guide", "Mark", 5.2);
        eb.showEBook();
    }
}
