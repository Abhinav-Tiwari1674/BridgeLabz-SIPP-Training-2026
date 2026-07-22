package JavaConstructorsInstancevsClassVariablesAccessModifiers.level1.AccessModifiers;

public class BookClass {
     public String ISBN;    // public
    protected String title; // protected
    private String author;  // private

    BookClass(String ISBN, String title, String author) {
        this.ISBN = ISBN;
        this.title = title;
        this.author = author;
    }

    // public getter & setter for private author
    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    void showBook() {
        System.out.println("ISBN: " + ISBN + ", Title: " + title + ", Author: " + author);
    }
    
}
