public class Book {
    // Data Fields
    String title;
    String author;
    String isbn;
    String publicationDate;

    // method
    public void printBookInfo() {
        System.out.printf("""
                %s \n%s \n%s \n%s
                """, title, author, isbn, publicationDate);
    }

    // parameter w/o return type
    public Book() {
    }

    // contructor
    public Book(String bookTitle, String bookAuthor, String bookISBN, String bookPublicationDate) {
        this.title = bookTitle;
        this.author = bookAuthor;
        this.isbn = bookISBN;
        this.publicationDate = bookPublicationDate;

    }
}
