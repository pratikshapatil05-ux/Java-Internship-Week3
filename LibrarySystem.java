public class LibrarySystem {
    public static void main(String[] args) {
        // Create books
        Book b1 = new Book("Java Programming", "James Gosling");
        Book b2 = new Book("Data Structures", "Mark Allen");

        // Create member
        Member m1 = new Member("Pratiksha", 101);

        System.out.println(m1.getMemberInfo());
        System.out.println(b1.getDetails());
        System.out.println(b2.getDetails());

        b1.issueBook();
        b2.issueBook();

        b1.returnBook();

        System.out.println(b1.getDetails());
        System.out.println(b2.getDetails());
    }
}
