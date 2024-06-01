package ArrayOfObjects_LIbraryCatalog;

public class Book {

        private String title;// String to store the title of the book.
        private String	author; // String to store the author's name.
        private int yearPublished;// int to store the year the book was published.

        public Book(String title, String author, int yearPublished) {
            this.title = title;
            this.author = author;
            this.yearPublished = yearPublished;
        }

        public String getTitle() {
            return title;
        }

        public void setTitle(String title) {
            this.title = title;
        }

        public String getAuthor() {
            return author;
        }

        public void setAuthor(String author) {
            this.author = author;
        }

        public int getYearPublished() {
            return yearPublished;
        }

        public void setYearPublished(int yearPublished) {
            this.yearPublished = yearPublished;
        }

        @Override
        public String toString() {
            return "Book{" +
                    "title='" + title + '\'' +
                    ", author='" + author + '\'' +
                    ", yearPublished=" + yearPublished +
                    '}';
        }


    }

