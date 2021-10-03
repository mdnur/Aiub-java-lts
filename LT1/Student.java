public class Student {

    private int id;
    private String name;
    private double cgpa;

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCgpa(double cgpa) {
        this.cgpa = cgpa;
    }

    public int getId() {
        return this.id;
    }

    public String getName() {
        return this.name;
    }

    public double getCgpa() {
        return this.cgpa;
    }

    public void show() {
        System.out.println("Student ID : " + this.id);
        System.out.println("Student Name : " + this.name);
        System.out.println("Student CGPA : " + this.cgpa);
    }

    public static void main(String[] args) {
        Student student = new Student();
        student.setId(21445401);
        student.setName("Mohammad Nur");
        student.setCgpa(3.66);
        student.show();
    }
}