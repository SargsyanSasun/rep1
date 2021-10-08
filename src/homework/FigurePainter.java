package homework;
public class FigurePainter {
    public static void main(String[] args) {
      /*    *
            * *
            * * *
            * * * *   */

        for (int f = 0; f <4 ; f++) {
            for (int r = 0; r <f+1; r++)
                System.out.print("* ");
            System.out.println();}
            System.out.println();

      /*    * * * *
            * * *
            * *
            *
      */
        int a=4;
        for (int i = a-1; i >=0; i--) {
            for (int j = 0; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        System.out.println();

         /*            *
                      * *
                     * * *
                    * * * *  */

        int b=3;
        for (int i = 0; i <=b; i++) {
            for (int j = 1; j <=b-i; j++) {
                System.out.print(" ");}
            for (int f = 0; f <=i; f++) {
                System.out.print("* ");}
            System.out.println();
        }
        System.out.println();


        /*           *
                   * *
                 * * *
               * * * *   */
        int r=3;
        for (int i = 0; i <=r; i++) {
            for (int j = 1; j <=r-i; j++) {
                System.out.print("  ");}
            for (int f = 0; f <=i; f++) {
                System.out.print("* ");}
            System.out.println();
        }
        System.out.println();

      /*          *
                 * *
                * * *
               * * * *
                * * *
                 * *
                  *  */
        int c=3;
        for (int i = 0; i <=c; i++) {
            for (int j = 1; j <=c-i; j++) {
                System.out.print(" ");}
            for (int f = 0; f <=i; f++) {
                System.out.print("* ");}
            System.out.println();
        }
        for (int i = 1; i <=c; i++) {
            for (int j = 1; j <=i; j++) {
                System.out.print(" ");}
            for (int f = 0; f <=c-i; f++) {
                System.out.print("* ");}
            System.out.println();
        }

    }

}
