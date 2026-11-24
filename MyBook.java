class Book1{
    String title;
    double price;
    Book1() {
        title = "Unknown";
        price = 0.0;
    }
     Book1(String  title, double price){
       this.title=title;
        this.price=price;

    }
    Book1(String title){
        this.title=title;
    }
    void display(){
        System.out.println("title="+title);
        System.out.println("price="+price);

    }
}
public class MyBook{
    public static void main(String[] args) {
        Book1 b=new  Book1("pranay");
        Book1 c=new Book1("pranay", 2000);
        c.display();
        
    }
    
}
