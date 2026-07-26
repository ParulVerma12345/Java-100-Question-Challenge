class Student {
    String name;
    int age;

    Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String toString() {
        return "Name = " + name + ", Age = " + age;
    }
}

public class Ques65Student {
    public static void main(String[] args) {
        Student s1 = new Student("Sejal", 20);
        System.out.println(s1);
    }
}
