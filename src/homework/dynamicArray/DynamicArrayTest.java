package homework.dynamicArray;

public class DynamicArrayTest {

    public static void main(String[] args) {
        DynamicArray da = new DynamicArray();
        int[] array1 = {1,2,3,4,5,6,7,8,9,2};
        da.setArray(array1);
        da.getArray();
        da.add(11);
    }
}
