package ExceptionHandlingRules;

public class Rule_9 {
    public static void main(String[] args) {
        String name = null;
        try{
            System.out.println(name.length());
        }catch (ArithmeticException n){
            n.printStackTrace();
        }
        finally {
            System.out.println("This is the Finally block");
        }
    }
}
