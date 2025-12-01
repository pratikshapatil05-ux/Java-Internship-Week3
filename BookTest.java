class Book{
    String title;
    String author;
    boolean isAvailable = true;

    void issueBook(){
        if (isAvailable){
            isAvailable = false;
            System.out.println(title + " issued successfully.");
        } else {
            System.out.println(title + " is not available.");
        }
    }

    void returnBook(){
        isAvailable = true;
        System.out.println(title + " returned successfully.");
    }

    void displayDetails(){
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Available: " + isAvailable);
    }
}

public class BookTest{
    public static void main(String[] args) {
        Book b = new Book();
        b.title = "Java Programming";
        b.author = "James Gosling";
        b.displayDetails();

        b.issueBook();
        b.returnBook();
    }
}
