package bitlab.askar.module1.lesson9;

public class Frog extends Animal{

    int poison;
    String lake;


    public int getPoison() {
        return poison;
    }

    public void setPoison(int poison) {
        this.poison = poison;
    }

    public String getLake() {
        return lake;
    }

    public void setLake(String lake) {
        this.lake = lake;
    }

    public Frog() {

    }

    public Frog(String name, int weight, String location, int poison, String lake) {
        super(name,weight,location);
        this.poison = poison;
        this.lake = lake;
    }

    @Override
    public String toString() {
        return "Frog{" +
                "name='" + name + '\'' +
                ", weight=" + weight +
                ", location='" + location + '\'' +
                ", poison=" + poison +
                ", lake='" + lake + '\'' +
                '}';
    }
}
