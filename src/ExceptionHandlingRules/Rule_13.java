package ExceptionHandlingRules;

public class Rule_13 {public static void main(String[] args) {
    String name = "Alisha";
    try{
        System.exit(0);
        System.out.println(name.length());
    }finally {
        System.out.println("This is the finally block");
    }
}

}
