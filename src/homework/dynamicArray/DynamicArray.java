package homework.dynamicArray;

public class DynamicArray {

    private int[] array = new int[10];
    private int size = 0;

    public void add(int value) {
        if(array.length==size){
            exdent();
        }
        array[size++] = value;
    }
     public int getByIndex(int index){
        if(index<0|| index>array.length -1) {
            System.err.println("invalid index");
       return -1;
        }
        return  array[index];
     }


    private void exdent() {
        int [] tmp = new int[array.length+10];
        for (int i = 0; i <array.length; i++) {
            tmp[i]=array[i];
        }
        array=tmp;
    }

    public void print() {
        for (int i = 0; i < size; i++) {
            System.out.println(array[i] + " ");
        }
    }







}
