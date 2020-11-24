package bitlab.askar.module1.lesson9.practice;

public class Student extends User {

    private double gpa;
    private String courses[] = new String[100];
    private int indexOfCourses = 0;

    public Student() {
    }

    @Override
    public void login() {

    }

    public Student(int id, String login, String password, String name, String surname, double gpa) {
        super(id, login, password, name, surname);
        this.gpa = gpa;
    }

    public double getGpa() {
        return gpa;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }

    @Override
    public String getData() {
        return "Student{" +
                "gpa=" + gpa +
                ", id=" + id +
                ", login='" + login + '\'' +
                ", password='" + password + '\'' +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                '}';
    }

    public void addCoures(String course){
        courses[indexOfCourses] = course;
        indexOfCourses++;
    }

    public void getCourses(){
        for (int i=0;i<indexOfCourses;i++){
            System.out.println(courses[i]);
        }
    }

}
