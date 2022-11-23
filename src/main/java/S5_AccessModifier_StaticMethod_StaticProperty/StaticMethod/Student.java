package S5_AccessModifier_StaticMethod_StaticProperty.StaticMethod;

public class Student {
    private int rollno;
    private String name;
    private static String college = "BBDIT";

    public Student(){

    }

    public Student(int r, String n) {
        rollno = r;
        name = n;
    }

    public static void chance() {
        college = "CodeGym";
    }

    public void display() {
        System.out.println(rollno + "" + name + "" + college);
    }

    public static void main(String[] args) {
        Student.chance();

        Student s1 = new Student(111, "Hoang");
        Student s2 = new Student(222, "Khanh");
        Student s3 = new Student(333, "Nam");

        s1.display();
        s2.display();
        s3.display();
    }
}
