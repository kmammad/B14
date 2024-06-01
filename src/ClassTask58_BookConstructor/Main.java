package ClassTask58_BookConstructor;

public class Main {
    public static void main(String[] args) {


        // Create 4 Book objects using 4 different constructors

        Book book1 = new Book();
        book1.printInfo();
        Book book2 = new Book("The Sun Also Rises", "E. Hemingway");
        book2.printInfo();
        Book book3 = new Book("Interstellar", "Nolan", "Universal","Sci-Fi");
        book3.printInfo();

        Book book4 = new Book("Westworld", "Nolan", 1234, 234, "HBO", false, "Sci-Fi");

        book4.printInfo();


        book4.setAuthor("Hopkins");

        System.out.println(book4.getAuthor());

        book4.printInfo();

    }
}

/**
 * Design a class for Book.
 *
 * Instance variables:
 *  -title
 *  -author
 *  -isbn
 *  -pages
 *  -publisher
 *  -isHardCover
 *  -genre
 *
 *  Constructors:
 *  -no-arg - initializes all variables to your favorite book details
 *  -that accepts title and author and initializes only these
 *  -that accepts title, author, publisher and genre and initializes only these
 * - that accepts all parameters and initializes  all
 *
 *  instance methods:
 *
 *  -setAuthor(String author) ->changes the author name to a given author name
 *
 *  -setPublisher(String publisher) ->changes the publisher name to a given publisher name
 */

