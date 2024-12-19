package FinalizeMethod;

public class FinalizeMainMethod {
    public static void main(String[] args) {
        FinalizeMethodExample f = new FinalizeMethodExample();
        f = null;
        System.gc();
    }
}
