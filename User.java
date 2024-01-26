package Library_Management_System;

import java.util.ArrayList;
import java.util.List;

public class User {
    private String name;
    private List<Book> booksBorrowed;
    Library obj = new Library();

    public User(String name){
        this.name = name;
        this.booksBorrowed = new ArrayList<>();
    }

    public String getName(){
        return name;
    }

    public void borrowBook(Book book){
        booksBorrowed.add(book);
        System.out.println(book.getTitle() + "book withdrawn by" + name);
    }

    public void returnBook(Book book){
        if(booksBorrowed.remove(book)){
            System.out.println(book.getTitle() + " returned by " + name);
        }
        else{
            System.out.println("Book not found!!");
        }
    }

    public void listBooksBorrowed(){
        if(booksBorrowed.isEmpty()){
            System.out.println("No record of books borrowed!!");
        }
        else{
            System.out.println("Books borrowed by" + name);
            for(Book book: booksBorrowed){
                System.out.println(book.getTitle() + " by " + book.getAuthor());
            }
        }
    }
}
