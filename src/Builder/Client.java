package Builder;

public class Client {
    public static void main(String[] args) {
        Student student = Student.getBuilder()
                .setName("Renu")
                .setAge(25)
                .setPsp(90.00)
                .setUniversityName("ABC")
                .setGradYear(2015)
                .build();

//        student.setPsp(100);

        System.out.println("DEBUG");
    }
}
