package arrays;

public class ArrayUtilTest {
    public static void main(String[] args) {


        ArrayUtil.createArray(5);
        ArrayUtil.create2dArray(3,4);
        int[] array = new int[]{15, 26, 12, 5, 18, 31};
        ArrayUtil.addFirst(array,11);
        ArrayUtil.contains(array, 15);
            System.out.println(ArrayUtil.b);
        ArrayUtil.indexOf(array,18);
            System.out.println(ArrayUtil.a);
        ArrayUtil.remove(array,3);
        ArrayUtil.sum(array);
        ArrayUtil.getMax(array);
        ArrayUtil.getMin(array);
        ArrayUtil.getAvg(array);

    }
}
