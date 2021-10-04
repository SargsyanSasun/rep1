package com.company.intlong;

public class IntLong {


    public static void main(String[] args){

        int lightspeed;
        long days;
        long seqonds;
        long distance;
        lightspeed = 186000;
        days = 1000;
        seqonds=days*24*60*60;
        distance=lightspeed*seqonds;
        System.out.println(days);
        System.out.print(distance);



        int o;
        o=10;
        if(o==10){
            int p=20;
            System.out.println("o   p; " + o + " " + p);
            o=p*2;
            System.out.println("o = " + o );}
        int g;
        for(g=0; g<3; g++) {
            int h = -1;
            System.out.println("h  ravno" + h);
            h = 100;
            System.out.println("h  1ravno" + h);}

        //BYTE DARCNEl INT EV HAKARAK
        byte t;
        int y = 257;
        double u = 323142;
        System.out.println("int-i verapohum  byte. ");
        t =(byte) y;
        System.out.println(" y u t " + y + " " + t );
        y = (int) u;
        System.out.println("u ev y " + y + " " + t);
        System.out.println("duble darcnel  dyte.");
        t = (byte) u;
        System.out.println("t ev u " + u + " " + t);


    }

}
