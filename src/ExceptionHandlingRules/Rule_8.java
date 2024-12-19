package ExceptionHandlingRules;

public class Rule_8 {
    public static void main(String[] args) {
        String name = null;
        try{
            System.out.println(name.length());
        }finally {
            System.out.println("This is the Finally block");
        }
    }
}
