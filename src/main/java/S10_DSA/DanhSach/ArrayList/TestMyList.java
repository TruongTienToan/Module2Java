package S10_DSA.DanhSach.ArrayList;

public class TestMyList {
    public static class Student {
        private int id;
        private String name;

        public Student() {

        }

        public Student(int id, String name) {
            this.id = id;
            this.name = name;
        }

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }
    }

    public static void main(String[] args) {
        Student a = new Student(1,"Toàn");
        Student b = new Student(2, "Ý");
        Student c = new Student(3, "Long");
        Student d = new Student(4, "Huy");
        Student e = new Student(5,"Anh");
        Student f = new Student(6,"Phước");

        MyList<Student> studentMyList = new MyList<>();
        MyList<Student> newMyList = new MyList<>();
        studentMyList.add(a);
        studentMyList.add(b);
        studentMyList.add(c);
        studentMyList.add(d);
        studentMyList.add(e);
        studentMyList.getSize();

        newMyList = studentMyList.clone();
        Student student = newMyList.remove(2);
        System.out.println(student.getName());
    }
}
