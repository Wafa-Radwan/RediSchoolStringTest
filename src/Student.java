public class Student {
    String name;
    int age;

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String toString(){
        return String.format("Student's name %s, Student's age is %s ",name,age);
    }
}
