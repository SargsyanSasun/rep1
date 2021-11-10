package practical2;

public class OverloadDemo {

    void test() {
        System.out.println("metod is missing");
    }

    void test(int a) {
        System.out.println("a:" + a);
    }

    void test(int a, int b) {
        System.out.println("a and b:" + a + " " + b);
    }

    double test(double a) {
        System.out.println("double a:" + a);
        return a * a;
    }

    void test1() {
        System.out.println("metod is messig");
    }

    void test1(int a, int b) {
        System.out.println("a and b:" + a + " " + b);
    }

    void  test1(double a){
        System.out.println("internal change"+ " test(double)  a:" + a);
    }




}
