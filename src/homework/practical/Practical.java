package homework.practical;

public class Practical {
    public static void main(String[] args) {
        int z = 0;
        char c = 'o';
        char [] bolola = {'b','o','l','o','l','a'};
        for (int i = 0; i <bolola.length; i++) {
            if (c == bolola[i]) {
                z++;}}
        System.out.println(z);
        int g = 0;
        g = bolola.length - 1;
        if ('l' == bolola[g]) {System.out.println(true); }
        else  if('l' != bolola[g]);{ System.out.println(false);}
        int t = 0;
        t = bolola.length / 2;
        System.out.print(bolola[t]+ " ");
        t--;
        System.out.println(bolola[t]);
        char[] babola = {'b','a','b','o','l','a'};
        int p = 0;
        for (int i = 0; i <babola.length; i++) {
            if('b'==    babola[ i] && 'b'==babola[i+2]){
                System.out.println(true);}
            else  System.out.println(false);}
        char[] text = {' ',' ','b','a',' ','r','e','v',' ',' '};
        for (int i = 0; i <text.length; i++) {
            if (' ' != text[i]) {

                System.out.print(text[i]);}}


    }
}



