package ArrayOfObjects_LIbraryCatalog;

public class LibraryCatalog {

    private Book[] books;

    public Book[] getBooks() {
        return books;
    }

    public int getCount() {
        return count;
    }

    private int count;

    public LibraryCatalog(int size){
        books = new Book[size];
        count = 0;
    }

    public void addBook(Book book){

        books[count] =  book;
        count++;
        System.out.println("Book added successfully!");



    }

    public void displayCatalog(){
        System.out.println("Catalog: ");
        for (int i = 0; i < count; i++) {
            System.out.println( (i+1)+ ". "+books[i].getTitle()+" by "+books[i].getAuthor()+", "+books[i].getYearPublished());
        }
        System.out.println("-------------------------------------");
    }

    /*
    Searches for books by title. Prints details of all books that match the search query.
     */
    public void searchByTitle(String title){
        boolean isNotFound = true;
        for (int i = 0; i < count; i++) {
            if(books[i].getTitle().equalsIgnoreCase(title)){
                System.out.println( (i+1)+ ". "+books[i].getTitle()+" by "+books[i].getAuthor()+", "+books[i].getYearPublished());
                isNotFound = false;
            }
        }

        if(isNotFound){
            System.out.println("Book with the title " + title + " is not found");
        }

    }
}
