package practical2;

public class OverloadDemoTest {

    public static void main(String[] args) {

        OverloadDemo od = new  OverloadDemo();
        double result;

        od.test();
        od.test(10);
        od.test(10,20);
        result = od.test(123.25);
        System.out.println(" rezultat metoda " + result );

         int i = 88;
      od.test1();
      od.test1(40,50);
      od.test1(i);
      od.test1(123.2);


    }

}
