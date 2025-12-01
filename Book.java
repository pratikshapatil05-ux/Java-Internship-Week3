class Book {
    private String title;
    private String author;
    private boolean isAvailable = true;

    public Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    public void issueBook() {
        if (isAvailable) {
            isAvailable = false;
            System.out.println(title + " issued successfully.");
        } else {
            System.out.println(title + " is already issued.");
        }
    }

    public void returnBook() {
        isAvailable = true;
        System.out.println(title + " returned successfully.");
    }

    public String getDetails() {
        return "Title: " + title + ", Author: " + author + ", Available: " + isAvailable;
    }
}
