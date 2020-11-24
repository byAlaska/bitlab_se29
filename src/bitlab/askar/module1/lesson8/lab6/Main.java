package bitlab.askar.module1.lesson8.lab6;

public class Main {
    public static void main(String[] args){


        Library library = new Library("Abai","Almaty");
        library.addBook(new Book("Sunrise","kafka",12512,1222));


        System.out.println(library.getAllBooks());

        library.addBook(new Book("Lonely","Mariam Shepard",125125,2999));
        System.out.println(library.getBook(1));

        System.out.println(library.getAllBooks());


    }
}
