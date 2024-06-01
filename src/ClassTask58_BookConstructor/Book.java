package ClassTask58_BookConstructor;

public class Book {

    String title;
    String author;
    int isbn;
    int pages;
    String publisher;

    boolean isHardCover;

    String genre;

    public Book() {
        title = "Mumu";
        author = "Turgenev";
        isbn = 1234;
        pages = 200;
        publisher = "Samizdat";
        isHardCover = false;
        genre = "Sci-Fi";
    }

    public Book(String title1, String author1) {
        title = title1;
        author = author1;
    }

    public Book(String title1, String author1, String publisher1, String genre1) {
        title = title1;
        author = author1;
        publisher = publisher1;
        genre = genre1;
    }

    public Book(String title1, String author1, int isbn1, int pages1, String publisher1, boolean isHardCover1, String genre1) {
        title = title1;
        author = author1;
        isbn = isbn1;
        pages = pages1;
        publisher = publisher1;
        isHardCover = isHardCover1;
        genre = genre1;
    }

    public void setAuthor(String author1){
        author = author1;
    }

    public String getAuthor(){
        return  author;
    }

    public void setPublisher(String publisher1){
        publisher = publisher1;
    }

    public void printInfo(){
        System.out.println("Book title is " + title + " author is " + author + " isbn " + isbn + " total pages " + pages + " published by " + publisher + " with hard copy " + isHardCover  + " and genre "  + genre);
    }
}
