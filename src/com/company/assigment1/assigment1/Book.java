package assigment1;

import java.util.Scanner;

//Write a program to create a book class. The Book class would have following private variables
public class Book {

  private String name;
  private String bookID;
  private String genres;
  private double price;

  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    Book book = new Book();

    System.out.println("The book's name is:");
    String name = input.next();
    book.setName(name);
    System.out.println("The book's ID is:");
    String id = input.next();
    book.setBookID(id);
    System.out.println("The book's genre is:");
    String genres = input.next();
    book.setGenres(genres);
    System.out.println("The book's price is:");
    double price = input.nextDouble();
    book.setPrice(price);
    Book book1 = new Book(name, id, genres, price);
  }

  public Book() {
    System.out.println("hello");
  }

  public Book(String name, String bookID, String genres, double price) {
    this.name = name;
    this.bookID = bookID;
    this.genres = genres;
    this.price = price;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getBookID() {
    return bookID;
  }

  public void setBookID(String bookID) {
    this.bookID = bookID;
  }

  public String getGenres() {
    return genres;
  }

  public void setGenres(String genres) {
    this.genres = genres;
  }

  public double getPrice() {
    return price;
  }

  public void setPrice(double price) {
    this.price = price;
  }
}