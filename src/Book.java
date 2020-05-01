public class Book {

    private String title;
    private String author_first_name;
    private String author_last_name;
    private String description;
    private double price;
    private boolean isInStock;
    //parameterized constructor
    public Book(String title, String author_first_name, String author_last_name, String description, double price) {
        this.title = title;
        this.author_first_name = author_first_name;
        this.author_last_name = author_last_name;
        this.description = description;
        this.price=price;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setAuthor_first_name(String author_first_name) {
        this.author_first_name = author_first_name;
    }

    public void setAuthor_last_name(String author_last_name) {
        this.author_last_name = author_last_name;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setInStock(boolean inStock) {
        isInStock = inStock;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor_first_name() {
        return author_first_name;
    }

    public String getAuthor_last_name() {
        return author_last_name;
    }

    public String getDescription() {
        return description;
    }

    public double getPrice() {
        return price;
    }

    public boolean isInStock() {
        return isInStock;
    }

    public String getDisplayText(){
        return
                "title='" + title + '\'' +
                        ", author_first_name='" + author_first_name + '\'' +
                        ", author_last_name='" + author_last_name + '\'' +
                        ", description='" + description + '\'';

    }
}



