package ExceptionHandlingRules;

public class Rule_12 {
    public static void main(String[] args) {
        String name = "Alisha";
        try{
            System.out.println(name.length());
        }finally {
            System.out.println("This is the finally block");
        }
    }
}
