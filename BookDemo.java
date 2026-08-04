class Author {
    String name;
    String email;
    char gender;
Author(String name,String email,char gender){
        this.name=name;
        this.email=email;
        this.gender=gender;
    }
    
}
class Book {
    String name;
    Author author;
     double price;
     int stock;
    Book(String name, Author author, double price, int stock) {
        this.name = name;
        this.author = author;
        this.price = price;
        this.stock = stock;
    }
    
}
public class BookDemo {
    public static void main(String args[]) {
        Author a = new Author("Akshay", "akshay@gmail.com", 'm');
        Book b = new Book("Advanced Java Programming", a, 780.0, 21);
        System.out.println("Book Name : " + b.name);
        System.out.println("Price : " + b.price);
        System.out.println("Stock : " + b.stock);
        System.out.println("Author Name : " + b.author.name);
        System.out.println("Author Email : " + b.author.email);
        System.out.println("Gender : " + b.author.gender);
    }
}

