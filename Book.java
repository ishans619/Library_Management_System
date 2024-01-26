package Library_Management_System;

class Book{
    private String title;
    private String author;
    private int ISBN;
    private boolean available;

    public Book(String title, String author, int ISBN, boolean available){
        this.title = title;
        this.author = author;
        this.ISBN = ISBN;
        this.available = available;
    }
    //getter methods
    public String getTitle(){
        return title;
    }

    public String getAuthor(){
        return author;
    }

    public int getISBN(){
        return ISBN;
    }

    public boolean isAvailable(){
        return available;
    }

    //setter methods
    public void setAvailable(boolean available){
        this.available = available;
    }


}