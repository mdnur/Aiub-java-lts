public class Student1 {

    private int id;
    private String name;
    private double cgpa;

    public void setId(int id) {
        id = id;
    }

    public void setName(String name) {
        name = name;
    }

    public void setCgpa(double cgpa) {
        cgpa = cgpa;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getCgpa() {
        return cgpa;
    }

    public void show() {
        System.out.println("Student ID : " + id);
        System.out.println("Student Name : " + name);
        System.out.println("Student CGPA : " + cgpa);
    }

    public static void main(String[] args) {
        Student student = new Student();
        student.setId(457454847);
        student.setName("iftty");
        student.setCgpa(4.00);
        student.show();
    }
}