package Builder;

public class Client {
    public static void main(String[] args) {
        StudentHelper helper = new StudentHelper();
        helper.name = "Abhishek";
        helper.age = 10;
        helper.psp = 0.0;
        helper.graduationYear = 2050;

        Student st = new Student(helper);
        System.out.println(st);
    }
}
