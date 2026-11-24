class  UserRegistration{
    public  void register(String name, int userId) {
        System.out.println("name="+name);
        System.out.println("userId="+userId);
    }
    public  void register(int userId, String name){
        System.out.println("userId="+userId);
        System.out.println("username="+name);
    }
}
public class user_Main {
    public static void main(String[] args) {
        UserRegistration user=new UserRegistration();
        user.register("pranay", 21);
        user.register(21, "pranay");
        
    }
    
}
