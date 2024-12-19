package AbstractPackage;

public abstract class AbstractClass {
    int x = 100;

    public abstract void methodDemo();

    public AbstractClass() {
        System.out.println("Abstract class example");
    }
    public void normalMethod(){
        System.out.println("Normal method");
    }

    public static void staticNormalMethod(){
        System.out.println("Static method");
    }

    public final void finalNormalMethod(){
        System.out.println("Final Method");
    }
}
