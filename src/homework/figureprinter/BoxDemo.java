package homework.figureprinter;

public class BoxDemo {

    public static void main(String[] args) {

        Box myBox = new Box();
        Box myBox1 = new Box();


        myBox.width = 10;
        myBox.depth = 20;
        myBox.height = 15;
        double vol  = myBox.volume();
        System.out.println(myBox.volume());

        myBox1.height = 100;
        myBox1.width = 200;
        myBox1.depth = 10;
        double volume = myBox1.volume();


        myBox.setDim(2,4,6);




    }
}
