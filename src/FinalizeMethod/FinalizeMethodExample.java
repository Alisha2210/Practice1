package FinalizeMethod;

public class FinalizeMethodExample {
    @Override
    protected void finalize() throws Throwable {
        System.out.println("This is the Finalize method");
    }
}
