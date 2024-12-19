package AbstractPackage;

public class ImplementationClass extends AbstractClass{
    ImplementationClass(){
        super();
    }

    @Override
    public void methodDemo() {
        System.out.println("Abstract Method Implementation");
    }

    public static void main(String[] args) {
        ImplementationClass ic = new ImplementationClass();
        ic.staticNormalMethod();
        ic.methodDemo();
        ic.finalNormalMethod();
        ic.normalMethod();

    }
}
