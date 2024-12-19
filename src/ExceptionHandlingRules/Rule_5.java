package ExceptionHandlingRules;

public class Rule_5 {
    public static void main(String[] args) {
        String name = null;
        try{
            System.out.println(name.length());
        }catch (Exception e){
            e.printStackTrace();
        }
        System.out.println("Hello everyone");
    }
}
