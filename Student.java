public class Student {
    private String name;
    private int age;

    public Student() {
        name = "No name";
        age = 0;
    }

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Student(String name) {
        this.name = name;
        this.age = 0;
    }

    public void displayInfo() {
        System.out.println("Name: " + name + ", Age: " + age);
    }

    public static void main(String[] args) {
        Student student1 = new Student();
        student1.displayInfo(); 

        Student student2 = new Student("Jelianne Ypanto", 20);
        student2.displayInfo(); 

        Student student3 = new Student("Althea Ypanto");
        student3.displayInfo(); 
    }
}