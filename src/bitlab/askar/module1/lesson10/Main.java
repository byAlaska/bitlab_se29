package bitlab.askar.module1.lesson10;

public class Main {
    public static void main(String[] args){

        Telephone telephone = new Telephone();
        telephone.charge();

        Multivarka multivarka = new Multivarka();
        multivarka.cook();
        multivarka.charge();

        Plita plita = new Plita();
        plita.cook();

        CanCharge[] canCharges = {telephone,multivarka};

        for (int i=0;i<2;i++){
            canCharges[i].charge();
        }
    }
}
