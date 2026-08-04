class Animal{
    void eat(){
    System.out.println("Animal eats food");
    }
    
    void sleep(){
    System.out.println("Animal sleeps");
    }
    }
    
    class Bird extends Animal{
    void eat(){
    System.out.println("Bird eats seeds");
    }
    
    void sleep(){
    System.out.println("Bird sleeps in its nest");
    }
    
    void fly(){
    System.out.println("Bird flies in the sky");
    }
    }
    
    public class Animals{
    public static void main(String[] args){
    Animal a = new Animal();
    a.eat();
    a.sleep();
    
    System.out.println();
    
    Bird b = new Bird();
    b.eat();
    b.sleep();
    b.fly();
    }
    }