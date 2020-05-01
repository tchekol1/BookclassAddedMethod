import java.util.ArrayList;

public class BookMethod {
    public static void main(String[] args) {
        //Create a method that returns the pricing for a requested number of books.
        // Five books at $20.00 should return $100, if they are in stock.
        // If they are not in stock, that should be handled appropriately (hint - you decide).
        //creating a book object from a Book class
        //Arraylist to hold books collections
        ArrayList<Book>book= new ArrayList<>();
        double totalBookPrice=0;
        Book book1= new Book("Fantastic Beasts", "Jacky",
                "Rowling","adventuries novel",20);
        Book book2= new Book("Harry Potter", "Jacky",
                "Rowling","fiction",20);
        Book book3= new Book("Staring with >>> Java", "Tonny",
                "Gaddis","A beginner guide to Java",20);
        Book book4= new Book("C++ >>> Java", "Tonny",
                "Gaddis","A beginner guide to C++",20);
        Book book5= new Book("Staring with >>> Ruby", "Tonny",
                "Gaddis","A beginner guide to Ruby",20);
        book.add(book1);
        book.add(book2);
        book.add(book3);
        book.add(book4);
        book.add(book5);
        book1.setInStock(true);
        book2.setInStock(true);
        book3.setInStock(false);
        book4.setInStock(false);
        book5.setInStock(true);
        for (Book bk:book) {
            if(bk.isInStock()){
                totalBookPrice+=bk.getPrice();
            }
        }
        //Total price of books available in the stock;
        System.out.println("Total price of books in stock = "+ totalBookPrice);


    }
}

