package ExceptionHandlingRules;

public class Rule_11 {
    public static void main(String[] args) {
        String name = null;
        try{
            System.out.println(name.length());
        } catch (ArithmeticException e) {
            e.printStackTrace();
        }finally {
            System.out.println("This is the Finally block");
        }
    }
}
