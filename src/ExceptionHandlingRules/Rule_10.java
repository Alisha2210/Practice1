package ExceptionHandlingRules;

public class Rule_10 {
    public static void main(String[] args) {
        String name = null;
        try{
            System.out.println(name.length());
        } catch (NullPointerException e) {
            e.printStackTrace();
        }finally {
            System.out.println("This is the Finally block");
        }
    }
}
