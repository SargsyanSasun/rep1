package homework.practical;

public class Practic {
    char[] bolola = {'b', 'o', 'l', 'o', 'l', 'a'};
    void action1(){
        int z = 0;
        char c = 'o';
        char[] bolola = {'b', 'o', 'l', 'o', 'l', 'a'};
        for (int i = 0; i < bolola.length; i++) {
            if (c == bolola[i]) {
                z++;
            }
        }
        System.out.println(z);
    }
    void action2(){
        int g = 0;
        g = bolola.length - 1;
        if ('l' == bolola[g]) {
            System.out.println(true);
        } else if ('l' != bolola[g]) ;
        {
            System.out.println(false);
    }}
    void action3(){
        int t = 0;
        t = bolola.length / 2;
        System.out.print(bolola[t] + " ");
        t--;
        System.out.println(bolola[t]);
        }
    void action4(){
        char[] babola = {'b', 'a', 'b', 'o', 'l', 'a'};
        boolean y = false;
        for (int i = 0; i < babola.length; i++) {
            if ('b' == babola[i] && 'b' == babola[i + 2]) {
                y = true;
                break;
            }
        }
        System.out.println(y);
    }
    void action5(){

        char [] result;
        char[] text = {' ', ' ', 'b', 'a', ' ', 'r', 'e', 'v', ' ', ' '};
        for (int i = 0; i <text.length; i++) {
            if (' ' != text[i]) {
                result = text;
                System.out.print(result[i]);
            }
        }




    }
}





