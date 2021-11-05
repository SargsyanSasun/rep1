package homework.dynamicArray;

public class DynamicArray {
        //սա մեր մասիվն է, որտեղ պահելու ենք ավելացող էլեմենտները
        private int[] array = new int[10];

        public void setArray(int[] array1) {
            this.array = array1;
        }

        public int[] getArray() {
            return array;
        }

        //սա մեր մասիվի մեջ ավելացված էլեմենտների քանակն է
        private int size = 0;

        //ստուգել, եթե մասիվի մեջ  տեղ չկա -> կանչել exdent()
        //և ավելացնել
        public void add(int value) {
            if (value > array.length) {
                System.out.println("տրված մասիվի էլեմենտների քանակն է "+ value);
                System.out.println("մասիվի երկարութնունն  է՝ " + array.length);
                size = value - array.length;
                exdent(array);
            }
        }
        //1. ստեղծել հին մասիվից 10 էլեմենտով ավելի մեծ մասիվ
        //2.  հին մասիվի էլեմենտնեըը ավելացնել նորի մեջ
        //3. հին մասիվի հղումը կապել նորի հետ
        int exdent (int[] array) {
            int array1[] = new int[array.length + 10];
            for (int i = 0; i < array1.length; i++) {
                array1[i] = array[i];
                print();            }
            array = array1;
            return 0;
        }

        //եթե տրված ինդեքսը մեր ունեցած մասիվի ինդեքսի սահմաննեռում է, վերադաձնել
        //մասիվի index-երրորդ էլեմենտը:Հակառակ դեպքում վերադարճնել -1:
        public int getByIndex ( int index){
            if(array.length>index){
                return array.length;
            }else{
                return -1;
            }
        }

        //տպել մասիվի ավելացված էլեմենտները
        public void print () {
            for (int i = 0; i <array.length; i++) {
                if (array[i] != 0 ) {
                    System.out.print(array[i]  + " ");}
            }
        }


    }

