
class LibraryItem {
    int itemId;
    String title;

    void displayDetails() {
        System.out.println("Item ID: " + itemId);
        System.out.println("Title: " + title);
    }
}

class Book extends LibraryItem {
    String author;
    String publisher;
}

class EBook extends Book {
    double fileSize;

    void downloadBook() {
        System.out.println("Downloading EBook...");
        System.out.println("File Size: " + fileSize + " MB");
        System.out.println("Download Successful!");
    }
}

public class LibraryManagement {
    public static void main(String[] args) {

        EBook e = new EBook();

        e.itemId = 101;
        e.title = "Java Programming";
        e.author = "James Gosling";
        e.publisher = "Pearson";
        e.fileSize = 15.5;

        e.displayDetails();

        System.out.println("Author: " + e.author);
        System.out.println("Publisher: " + e.publisher);

        e.downloadBook();
    }
}
