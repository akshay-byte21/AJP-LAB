class Author {
    String name;
    String email;
    char gender;
Author(String name,String email,char gender){
        this.name=name;
        this.email=email;
        this.gender=gender;
    }
    public String getname() {
        return name;
    }
    public String getemail() {
        return email;
    }
    public char getgender() {
        return gender;
    }
    public void setemail(String email) {
        this.email = email;
    }
}
class Book {
    private String name;
    private Author author;
    private double price;
    private int stock;
    Book(String name, Author author, double price, int stock) {
        this.name = name;
        this.author = author;
        this.price = price;
        this.stock = stock;
    }
    public String getname() {
        return name;
    }
    public Author getAuthor() {
        return author;
    }
    public double getPrice() {
        return price;
    }
    public int getstock() {
        return stock;
    }
    public void setPrice(double price) {
        this.price = price;
    }
    public void setstock(int qty) {
        stock = qty;
    }
}
public class BookDemo {
    public static void main(String args[]) {
        Author a = new Author("Akshay", "akshay@gmail.com", 'm');
        Book b = new Book("Advanced Java Programming", a, 780.0, 21);
        System.out.println("Book Name : " + b.getname());
        System.out.println("Price : " + b.getPrice());
        System.out.println("Stock : " + b.getstock());
        System.out.println("Author Name : " + b.getAuthor().getname());
        System.out.println("Author Email : " + b.getAuthor().getemail());
        System.out.println("Gender : " + b.getAuthor().getgender());
    }
}

