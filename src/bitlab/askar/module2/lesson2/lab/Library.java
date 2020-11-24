package bitlab.askar.module2.lesson2.lab;

import java.util.ArrayList;

public class Library {

    String name;
    private String city;
    private ArrayList<Book> books = new ArrayList<>();

    public Library() {
    }

    public Library(String name, String city) {
        this.name = name;
        this.city = city;
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

    public void addBook(Book book) {
        books.add(book);
    }

    public void printBooks(){
        for (int i=0;i<books.size();i++){
            try {
                System.out.println(books.get(i).toString());
            }catch (Exception e){
                System.out.println("book is empty ->" + i);
            }
        }
    }
}
