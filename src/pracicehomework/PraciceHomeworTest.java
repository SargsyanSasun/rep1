package pracicehomework;

public class PraciceHomeworTest {

    public static void main(String[] args) {
        int[]lop;
        int[] kol;
      long y =0;
        PraciceHomework action = new PraciceHomework();


        action.convert(55);
        System.out.println(action.seconds);
             y = action.seconds + 200;
        System.out.println(y);

        action.calcAge(2);
        System.out.println(action.days);

        action.nextNumber(256);
        System.out.println(action.nextNum);

        action.isSameNum(2, 2);
        System.out.println(action.trueFalse);

        action.lessThanOrEqualToZero(5);
        System.out.println(action.trueFalse);

        action.reverseBool(false);
        System.out.println(action.trueFalse);

        action.maxlength(lop=new int[]{1,2,3,} ,kol= new int[]{10, 20, 30,5});

      System.out.println(action.bolshe);


    }
}
