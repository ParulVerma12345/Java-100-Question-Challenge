
class Student {

    final int id;

    final String name;

    Student(int id, String name) {

        this.id = id;

        this.name = name;

    }

    void display() {

        System.out.println("ID = " + id);

        System.out.println("Name = " + name);

    }

}

public class Ques71Student1 {

    public static void main(String[] args) {

        Student s1 = new Student(101, "Sejal");

        s1.display();

    }

}