package ArrayOfObjects_LIbraryCatalog;

    import java.util.Scanner;

    public class Main {



        public static void main(String[] args) {

            System.out.println("Welcome to the Library Catalog System!");

            LibraryCatalog libraryCatalog = new LibraryCatalog(2);

            Scanner scanner = new Scanner(System.in);
            OUTER: while(true){

                System.out.println("""
                    1. Add Book
                    2. Search by Title
                    3. List All Books
                    4. Exit
                    """);

                System.out.print("Enter your choice: ");
                int choice = scanner.nextInt();

                switch (choice){
                    case 1:
                        if(libraryCatalog.getCount()<libraryCatalog.getBooks().length){
                            System.out.print("Enter book title:");
                            scanner.nextLine();
                            String title = scanner.nextLine();
                            System.out.print("Enter author:");
                            String author = scanner.nextLine();
                            System.out.print("Enter publication year:");
                            int year = scanner.nextInt();

                            Book book = new Book(title, author, year);
                            libraryCatalog.addBook(book);
                        }else {
                            System.out.println("Catalog is full. Can't add any more books. ");
                        }

                        break;
                    case 2:
                        System.out.print("Enter book title:");
                        scanner.nextLine();
                        String title2 = scanner.nextLine();
                        libraryCatalog.searchByTitle(title2);
                        break;
                    case 3:
                        libraryCatalog.displayCatalog();
                        break;
                    case 4:
                        System.out.println("Thank you for using the Library Catalog System. Goodbye!");
                        break OUTER;
                    default:
                        System.out.println("Wrong choice");
                        break;

                }

            }


        }
}
