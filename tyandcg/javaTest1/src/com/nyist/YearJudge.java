package com.nyist;

import java.util.Scanner;

public class YearJudge {
    public static void main(String[] args) {
        while(true){
            Scanner year = new Scanner(System.in);
            int YEAR=year.nextInt();
            if((YEAR%4==0&YEAR%100!=0)|YEAR%400==0){
                System.out.println(YEAR+"是闰年");
        }
            else
                System.out.println(YEAR+"不是闰年");
        }
    }
}
