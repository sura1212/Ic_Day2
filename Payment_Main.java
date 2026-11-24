class Payment{
    double amount;
     void pay(double amount){
        System.out.println("Processing generic payment of ₹" + amount);
        
     }

}
class  CreditCard extends  Payment{
    double amount;
    @Override 
    void  pay(double amount){
        System.out.println( "Paid ₹" + amount + " via CreditCard");
    } 

}
class UPI extends  Payment{
    
    @Override 
    void  pay(double  amount){
        System.out.println("Paid ₹" + amount + " via UPI");
    }

}
public class Payment_Main {
    public static void main(String[] args) {
        Payment[] payments = {
            new CreditCard(),
            new UPI()
        };

        for (Payment payment : payments) {
            payment.pay(500.0);
        }
    }
    
}
