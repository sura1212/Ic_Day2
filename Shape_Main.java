class Shape{
    public  void draw() {
        System.out.println("Drawing a shape");
    }
}
class  Circle extends Shape{

    @Override 
    public  void draw() {
        System.out.println("Drawing a citcle");
    }
}
class  Square extends Shape{
    @Override 
    public  void draw() {
        System.out.println("Drawing a square");
    }

}


public class Shape_Main {
    public static void main(String[] args) {
        Circle c=new Circle();
        c.draw();
        Square s=new Square();
        s.draw();
        
    }
    
}
