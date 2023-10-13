public class Book {
    String title;
    String author;
    int numberOfPages;
    int readPages = 0;

    public void displayBookInfo() {
        System.out.println(title + " written by " + author + ", number of pages: " + numberOfPages);
    }

    public void read(int num) {
        readPages += num;
        if (readPages >= numberOfPages) {
            System.out.println("You have read the whole book!");
            readPages = 0;
        } else {
            System.err.println("You have already read " + readPages + " pages");
        }
    }

    public static void main(String[] args) {
        Book book = new Book();

        book.title = "Harry Potter and the Philosopher's Stone";
        book.author = "J. K. Rowling";
        book.numberOfPages = 567;

        book.displayBookInfo();

        book.read(200);
        book.read(400);

    }
}
