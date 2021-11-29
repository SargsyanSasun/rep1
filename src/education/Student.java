package education;

public class Student {

    private String name;
    private String surname;
    private String email;
    private int age;
    private String phone;
    private String lssonname;
    private double time;
    private String lecturerName;
    private double price;

    public Student(){

    }
    public Student(String name, String surname,Integer age, String email,  String phone) {
        this.name = name;
        this.surname = surname;
        this.email = email;
        this.age = age;
        this.phone = phone;
    }
    public Student(String lssonname, double time, String lecturerName, double price) {
        this.lssonname = lssonname;
        this.time = time;
        this.lecturerName = lecturerName;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname(String s) {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

   public int getAge() {
       return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getLssonname() {
        return lssonname;
    }

    public void setLssonname(String lssonname) {
        this.lssonname = lssonname;
    }

    public double getTime() {
        return time;
    }

    public void setTime(double time) {
        this.time = time;
    }

    public String getLecturerName() {
        return lecturerName;
    }

    public void setLecturerName(String lecturerName) {
        this.lecturerName = lecturerName;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String toStrind() {
        return "Student{" +
                "lssonname='" + lssonname + '\'' +
                ", time='" + time + '\'' +
                ", lecturerName='" + lecturerName + '\'' +
                ", price='" + price + '\'' +
                '}';
    }

    @Override
    public String toString() {
        return "Student {" +
                "name = '" + name + '\'' +
                ", surname = '" + surname + '\'' +
                ", email = '" + email + '\'' +
                ", age = " + age +
                ", phone = '" + phone + '\'' +
                '}';
    }

}

