package com.yi;

import java.util.*;

public class PokerDemo {
    public static void main(String[] args) {
        //创建一个HashMap集合
        HashMap<Integer,String> hm = new HashMap<Integer,String>();
        //创建一个ArrayList集合
        ArrayList<Integer> arr = new ArrayList<Integer>();
        //创建花色和点数数组
        String [] colors = {"♠","♥","♣","♦"};
        String [] numbers= {"3","4","5","6","7","8","9","10","J","Q","K","A","2"};
        //从0开始往HashMap里存编号，并存储对应的牌，同时往ArrayList里存入编号
        int index = 0;
        for (String number : numbers){
            for (String color : colors){
                String poker = color.concat(number);
                hm.put(index,poker);//往HashMap里存编号，并存储对应的牌
                arr.add(index);//往ArrayList里存入编号
                index++;
            }
        }
        hm.put(index,"小王");
        arr.add(index);
        index++;
        hm.put(index,"大王");
        arr.add(index);
        //洗牌
        Collections.shuffle(arr);
        //发牌，Arr的编号，创建TreeSet集合接收
        TreeSet<Integer> playerone = new TreeSet<Integer>();
        TreeSet<Integer> playertwo = new TreeSet<Integer>();
        TreeSet<Integer> playerthree = new TreeSet<Integer>();
        TreeSet<Integer> bottom = new TreeSet<Integer>();

        for (int x = 0; x < arr.size(); x++){
            if (x>=arr.size() -3 ){
                bottom.add(arr.get(x));
            }
            else if (x%3 == 0){
                playerone.add(arr.get(x));
            }
            else if (x%3 == 1){
                playertwo.add(arr.get(x));
            }
            else if (x%3 == 2){
                playerthree.add(arr.get(x));
            }
        }

        //看牌
        lookPoker("玩家一",playerone,hm);
        lookPoker("玩家二",playertwo,hm);
        lookPoker("玩家三",playerthree,hm);
        lookPoker("底牌",bottom,hm);

    }
    //看牌的功能
    public static void lookPoker(String name,TreeSet<Integer> ts,HashMap<Integer,String> hm){
        System.out.print(name+"的牌是：");
        for (Integer key : ts){
            String value = hm.get(key);
            System.out.print(value+"  ");
        }
        System.out.println();
    }
}
