package practical1;

public class StudentTest {


    public static void main(String[] args) {

        Student student= new Student("Poxos","Poxosyan",20,"java","777777777");

        System.out.println(student.getName());
        student.setName("poxsik");
        System.out.println(student.getName());
    }
}
