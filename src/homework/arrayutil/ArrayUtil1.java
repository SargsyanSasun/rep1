package homework.arrayutil;

public class ArrayUtil1 {
    int[] array  = {5,3,22,4,41,33,75,6,65,77};
    void action1(){
        int[] array  = {5,3,22,4,41,33,75,6,65,77};
        System.out.print("մասիվի անդամներն են՝ ");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array [i] +  ",");}
        System.out.println();
    }

    void action2(){

        int zoo = 0;
        int zoo1 = 0;
        System.out.print("մասիվի զույգ թվերը` ");
        for (int i = 0; i <array.length ; i++) {
            System.out.print(array[i] + " ");
            if(array[i] % 2 == 0){
        System.out.println();}
    }}
    void action3(){
        int zoo=0;
        for (int i = 0; i <array.length ; i++) {
            if(array[i] % 2 == 0){
                zoo++; }}
        System.out.println("մասիվի զույգ թվերի քանակը՝ " + zoo);
        System.out.print("մասիվի կենտ թվերը՝ ");
    }
    void action4(){
        for (int i = 0; i <array.length ; i++) {
            if(array[i] % 2 != 0){
                System.out.print( array[i] + ", " ); }}
        System.out.println();
    }
    void action5(){
        int zoo1=0;
        for (int i = 0; i <array.length ; i++) {
            if(array[i] % 2 != 0){
                zoo1++;}}
        System.out.println("կենտ թվերի քանակը՝ " + zoo1);
    }
    void action6(){
        int v;
        int b = 0;
        for (int i = 0; i <array.length ; i++) {
            v = array[i];
            b = v + b;}
        System.out.print("մասիվի բոլոր էլեմենտների գումարը՝ " +b);
        System.out.println();
    }
    void action7(){
        int v;
        int b = 0;
        for (int i = 0; i <array.length ; i++) {
            v = array[i];
            b = v + b;}
        int y;
        y = b / array.length;
        System.out.println("մասիվի միջին թվաբանականը՝ " + y);
        int max=array[0];
        int min=array[0];
        for (int i = 0; i <array.length; i++) {
            if (max<array[i]) {
                max = array[i];}
            if (min>array[i]) {
                min = array[i];} }
        System.out.println("մասիվի ամենամեծ արժեքը` " + max);
        System.out.print("մասիվի ամենափոքր արժեքը` " + min); }





}
