package bitlab.askar.module1.lesson9;

public class Animal {

    String name;
    int weight;
    String location;

    public Animal() {
    }

    public Animal(String name, int weight, String location) {
        this.name = name;
        this.weight = weight;
        this.location = location;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public void run(){
        System.out.println("RUNNING Like animal");
    }

//    @Override
//    public String toString() {
//        return "Animal{" +
//                "name='" + name + '\'' +
//                ", weight=" + weight +
//                ", location='" + location + '\'' +
//                '}';
//    }
}
