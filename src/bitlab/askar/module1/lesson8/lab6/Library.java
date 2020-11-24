package bitlab.askar.module1.lesson8.lab6;

public class Library {
    private String name;
    private String city;
    private Book[] books = new Book[100];
    private int sizeOfBooks = 0;


    public Library() {
    }

    public Library(String name, String city) {
        this.name = name;
        this.city = city;
    }


    public Library(String name, String city, Book[] books) {
        this.name = name;
        this.city = city;
        this.books = books;
        sizeOfBooks = books.length;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public int size() {
        return sizeOfBooks;
    }


    public void addBook(Book book) {
        books[sizeOfBooks] = book;
        sizeOfBooks++;
    }

    public Book getBook(int i){
        return books[i];
    }


    public String getAllBooks(){

        String data = "Name: " + name + ", city: " + city + "\n";

        for (int i=0;i<sizeOfBooks;i++){
            data += books[i].toString();
        }

        return data;
    }

}
