package bitlab.askar.module1.lesson9;

public class Main {
    public static void main(String[] args){

        Dog dog = new Dog("Rex",100,"kaz","Eldar",10);

        Dog dog1  = new Dog(dog.name,dog.weight,dog.location,dog.owner,dog.lenghtOfTail);

        dog.name = "Furri";

        System.out.println(dog.name);
        System.out.println(dog1.name);





    }
}
