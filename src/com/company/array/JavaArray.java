package com.company.array;

public class JavaArray {


    public static void main(String[] args){


     int[] month_days = new int[12];
      month_days[0]=31;
      month_days[1]=28;
      month_days[2]=31;
      month_days[3]=30;
      month_days[4]=31;
      month_days[5]=30;
      month_days[6]=31;
      month_days[7]=31;
      month_days[8]=30;
      month_days[9]=31;
      month_days[10]=30;
      month_days[11]=31;

        System.out.println("march has " + month_days[2]);
        System.out.println("november has " + month_days[10]);

       int[] money = new int[10];
        money[0]=24;
        money[1]=55;
        money[2]=66;
        money[3]=87;
        money[4]=15;
        money[5]=9;
        money[6]=3;
        money[7]=4;
        money[8]=12;
        money[9]=42;
        System.out.println(money[7]);
        System.out.println(money[4]);
        System.out.println(money[6]);

       int[] days  ={1,2,3,4,5,6,7};
        System.out.println(days [1]);



        double nums [] = {10.1, 11.2, 12.3, 13.4, 14.5};
         double result = 0;
        for (int i = 0; i < 5; i++) {
            result = result + nums[i];
            System.out.println("mijini arjeq " + result / 5);}

          int ful [] = {25,44,55,};
        for (int i = 0; i < 3; i++) {
            System.out.println(ful [i]);}

          int twoD [][] = new int[4][];
         twoD[0] = new int[5];
         twoD[1] = new int[5];
         twoD[2] = new int[5];
         twoD[3] = new int[5];
         int i,j,k = 0;
     for (i = 0; i <4; i++)
      for (j = 0; j <i+1; j++) {
       twoD[i][j] = k;
       k++;
      }
     for (i = 0; i<4; i++) {
      for (j = 0; j<i+1 ; j++)
       System.out.print(twoD[i][j] + " ");
      System.out.println();
     }












    }

}
