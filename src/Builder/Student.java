package Builder;

public class Student {
    String name;
    int age;
    double psp;
    int batchId;
    String universityName;
    int graduationYear;

    Student(StudentHelper helper){
        // validations can come here
        this.name = helper.name;
        this.age = helper.age;
        //... rest of the properties
    }
}


