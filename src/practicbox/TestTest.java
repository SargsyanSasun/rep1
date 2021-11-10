package practicbox;

public class TestTest {


    public static void main(String[] args) {

      Test od1=new Test(100,22);
      Test od2=new Test(100,22);
      Test od3=new Test(-1,-1);

        System.out.println("od1 == od2  " + od1.equals(od2));
        System.out.println( "od1 == od3 " + od1.equals(od3));


    }
}
