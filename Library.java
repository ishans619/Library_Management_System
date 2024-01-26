package Library_Management_System;

import java.util.ArrayList;
import java.util.List;

public class Library {

    private List<Book> booksAvailable;

    public Library(){
        this.booksAvailable = new ArrayList<>();
    }

    public void addBook(Book book){
        booksAvailable.add(book);
        System.out.println("The book added to the library: " + book.getTitle());
    }

    public void removeBook(Book book){
        if(booksAvailable.remove(book)){
            System.out.println("The book removed from the library: " + book.getTitle());
        }
        else{
            System.out.println("Book not in the library!!");
        }
    }

    public void listBooks(){
        if(booksAvailable.isEmpty()){
            System.out.println("No books present in the library!!");
        }
        else{
            System.out.println("Available books in the library->->");
            for(Book book: booksAvailable){
                System.out.println(book.getTitle() + "by" + book.getAuthor());
            }
        }
    }
    
    public boolean checkAvailablity(Book book){
        return booksAvailable.contains(book);
    }

    public void withdrawBook(Book book){
        if(booksAvailable.remove(book)){
            book.setAvailable(false);
            System.out.println("Book withdrawn: " + book.getTitle());
        }
        else{
            System.out.println("Book not available in the library!!");
        }
    }

    public void returnBook(Book book){
        if(!booksAvailable.contains(book)){
            booksAvailable.add(book);
            book.setAvailable(true);
            System.out.println("Book returned to the libaray: " + book.getTitle());
        }
        else{
            System.out.println("Book already present in the libaray");
        }
    }
}
