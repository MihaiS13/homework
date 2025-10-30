
public class Book {
    String title;
    String author;
    int pages;



    public static void main(String[] Args) {
        Book b1 = new Book();
        b1.title = "Java";
        b1.author = "Mihai";
        b1.pages = 350;

        Book b2 = new Book();
        b2.title = "Cartof";
        b2.author = "Jenii";
        b2.pages = 250;

        b1.printInfo();
        System.out.println("Este carte lungă? " + b1.isLongBook());

        b2.printInfo();
        System.out.println("Este carte lungă? " + b2.isLongBook());

    }

    void printInfo() {
        System.out.println(title + " Scrisa de " + author + " cu un numar de " + pages + " de pagini.");
    }

     boolean isLongBook() {
    return pages > 300;
    }

}



