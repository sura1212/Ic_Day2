class Bank{
    public  void getInterestRate(){
           System.out.println(0.0);
    }
}
class SBI extends  Bank{
    @Override 
    public  void getInterestRate(){
           System.out.println(6.5);
    }

}
class HDFC extends Bank{
    @Override 
    public  void getInterestRate(){
           System.out.println(7.0);
    }
    
}
public class Bank_Main {
   public static void main(String[] args) {
        SBI s= new SBI();
        s.getInterestRate();
        HDFC h=new  HDFC();
        h.getInterestRate();    
   } 
}
