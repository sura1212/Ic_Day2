class Calculator{
    void add(int a,int b){
        System.out.println(a+b);
    }
    void add(int a,int b,int c){
        System.out.println(a+b+c);
    }
}
public class Calculator_Main {
    public static void main(String[] args) {
        Calculator cal=new Calculator();
        cal.add(12, 3);
        cal.add(1, 2, 8);
        
    }
    
}
