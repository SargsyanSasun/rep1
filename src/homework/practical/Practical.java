package homework.practical;

public class Practical {
    public static void main(String[] args) {
        // 1
        int z = 0;
        char c = 'o';
        char[] bolola = {'b', 'o', 'l', 'o', 'l', 'a'};
        for (int i = 0; i < bolola.length; i++) {
            if (c == bolola[i]) {
                z++;
            }
        }
        System.out.println(z);
        //2
        int g = 0;
        g = bolola.length - 1;
        if ('l' == bolola[g]) {
            System.out.println(true);
        } else if ('l' != bolola[g])        {
            System.out.println(false);
        }
        //3
        int t = 0;
        t = bolola.length / 2;
        System.out.print(bolola[t] + " ");
        t--;
        System.out.println(bolola[t]);
        //4
        char[] babola = {'b', 'a', 'b', 'o', 'l', 'a'};
        boolean y = false;
        for (int i = 0; i < babola.length; i++) {
            if ('b' == babola[i] && 'b' == babola[i + 2]) {
                y = true;
                break;
            }
        }
        System.out.println(y);


    //5
        char [] result;
    char[] text = {' ', ' ', 'b', 'a', ' ', 'r', 'e', 'v', ' ', ' '};
        for (int i = 0; i <text.length; i++) {
            if (' ' != text[i]) {
                result = text;
                System.out.print(result[i]);
            }
        }
     /*     int []   kil = {1,6,4,5,2,7};
        for (int i = 0; i <kil.length; i++) {
            for (int j = 0; j < kil.length; j++) {
                if (kil[i] <= kil[j]) {
                    int a = kil[i];
                    kil[i] = kil[j];
                    kil[j] = a;
                }
            }
return kil;
        }
*/

        }}












