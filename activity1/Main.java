public class Main {
    public static void main(String[] args){
        Book faveBook1 = new Book();
        faveBook1.title = "Strange Pictures";
        faveBook1.author = "by Uketsu";
        faveBook1.isbn = "0063433087";
        faveBook1.publicationDate = "January 14, 2025";

        Book faveBook2 = new Book();
        faveBook2.title = "\nA Good Girl's Guide to Murder";
        faveBook2.author = "by Holly Jackson";
        faveBook2.isbn = "1405293187";
        faveBook2.publicationDate = "May 2 2019";

        Book faveBook3 = new Book("\nThe Housemaid", "by Freida McFadden", "1538742578", "August 23, 2022");

        Book faveBook4 = new Book("\nSay You'll Remember Me", "by Abby Jimenez", "1538759195", "April 1, 2025");

        faveBook1.printBookInfo();
        faveBook2.printBookInfo();
        faveBook3.printBookInfo();
        faveBook4.printBookInfo();


    }
}
