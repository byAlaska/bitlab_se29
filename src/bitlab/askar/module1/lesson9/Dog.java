package bitlab.askar.module1.lesson9;

public class Dog extends Animal {

    String owner;
    int lenghtOfTail;

    public Dog() {
    }

    public Dog(String name, int weight, String location, String owner, int lenghtOfTail) {
        super(name, weight, location);
        this.owner = owner;
        this.lenghtOfTail = lenghtOfTail;
    }

    @Override
    public void run() {
        System.out.println("RUNNING LIKE DOG");
    }

    @Override
    public String toString() {
        return super.toString() +
                ", owner='" + owner + '\'' +
                ", lenghtOfTail=" + lenghtOfTail +
                '}';
    }

}
