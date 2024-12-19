package ExceptionHandlingRules;

public class Rule_7 {
    public static void main(String[] args) {
            String name = null;
            try{
                System.out.println(name.length());
            }catch (NullPointerException n){
                n.printStackTrace();
            }catch (ArithmeticException ae){
                ae.printStackTrace();
            }catch (Exception e){
                e.printStackTrace();
            }
            System.out.println("Hello everyone");
        }
    }

