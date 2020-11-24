package bitlab.askar.module1.lesson10;

public class Multivarka implements CanCharge, CanCook, Cloneable{

    @Override
    public void charge() {
        System.out.println("Multivarka Is charging");
    }

    @Override
    public void cook() {
        System.out.println("Multivarka is cooking");
    }
}
