package Builder;

public class Student {
    String name;
    int age;
    double psp;
    int batchId;
    String universityName;
    int graduationYear;

    // one way would be to have all the checks in the constructor itself
    Student (String name, int age, double psp, int batchId, String universityName, int graduationYear){
        if(name != null){
            this.name = name;
        } else {
            System.out.println("throw error for name");
        }

        if(age >= 18){
            this.age = age;
        } else {
            System.out.println("throw error for age");
        }

        /*
        * similarly  we can configure checks / validations for all the properties above
        * This kind of implementation is not at all recommended. Why? because it breaks SRP, OCP
        * SRP - single responsibility principle
        * OCP - open  close principle
        *
        * Issues:
        * 1. Prone to errors
        * 2. Not much readable
        * 3. adding a new attribute is tiresome
        * */
    }
}


