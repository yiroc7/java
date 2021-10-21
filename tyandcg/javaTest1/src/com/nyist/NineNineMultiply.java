package com.nyist;

public class NineNineMultiply {
    public static void main(String[] args) {
        int a=1,b=1,mul=1;
        while (a<=9){
            b=1;
            while(b<=a){
                mul=a*b;
                System.out.print(b+"*"+a+"="+mul+"\t");
                b++;
            }
           a++;
            System.out.println();

        }
    }
}
