package EncapsulationPackage;

public class ExternalSetterMainClass {
    public static void main(String[] args) {
        SetterClass sc = new SetterClass();
        sc.setMarks(20);
        sc.setName("Alisha Shaikh");
        System.out.println(sc.getMarks());
        System.out.println(sc.getName());
    }
}
