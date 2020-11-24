package bitlab.askar.module1.lesson8;

public class Dog {

    private String name;
    private int weight;
    private int height;
    public static int cnt = 0;

    public Dog() {
    }

    public Dog(String name, int weight, int height){
        this.name = name;
        this.weight = weight;
        this.height = height;
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

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }


    @Override
    public String toString() {
        return "Dog: " + name + ", " + weight + ", " + height;
    }

}
