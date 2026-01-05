class Student {
    int rollNo;
    String name;
    void show() {
        System.out.println("Roll No: " + rollNo);
        System.out.println("Name: " + name);
        System.out.println("------------------");
    }
}

public class ObjectCreation {

    public static void main(String[] args) {

        // Creating first object
        Student s1 = new Student();
        s1.rollNo = 1;
        s1.name = "Amit";
        s1.show();

        // Creating second object
        Student s2 = new Student();
        s2.rollNo = 2;
        s2.name = "Neha";
        s2.show();
    }
}
