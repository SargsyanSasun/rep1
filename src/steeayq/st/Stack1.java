package steeayq.st;

public class Stack1 {


    int array[] = new int[10];
    int index;

    void push(int item){
            array [++index]= item;
        }

    int pop(){
            return array[index--];
        }


}
