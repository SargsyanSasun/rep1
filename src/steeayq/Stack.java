package steeayq;

public class Stack {



    int array[] = new int[10];
    int index;
    Stack(){
        index = -1;
    }
    void push(int item){
        if (index == 9) {
            System.out.println("stack is full");
        }else {
            array [++index]= item;
        }
    }
    int pop(){
        if (index<0) {
            System.out.println("stack is empty");
            return 0;

        }else {
            return array[index--];
        }
    }




}
