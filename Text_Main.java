class TextInput{
    void text(String text){
        System.out.println(text);
    }
    void text(int num){
        System.out.println(num);
    }
    void text(double  decima){
        System.out.println(decima);
    }
}
public class Text_Main {
    public static void main(String[] args) {
        TextInput t=new TextInput();
        t.text(200000);
        t.text(3333);
        t.text("pranay");
        
    }
    
}
