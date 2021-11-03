package com.yi;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class CardsDemo {
    public static void main(String[] args) {
        //创建扑克牌盒子
        ArrayList<String> array = new ArrayList<String>();
        //装牌
        //花色点数
        //定义花色数组
        String [] colors = {"♠","♥","♣","♦"};
        //定义一个牌面数组
        String [] numbers= {"A","2","3","4","5","6","7","8","9","10","J","Q","K"};
        for (String color : colors){//增强for[ for(元素数据类型 变量：数组或者Collection集合){使用变量即可}]外循环花色
            for (String number : numbers){//增强for内循环牌面数字
                array.add(color.concat(number));//字符串拼接的方法
            }
        }
        array.add("大王");
        array.add("小王");

        //洗牌
        Collections.shuffle(array);
        ArrayList<String> playerone = new ArrayList<String>();
        ArrayList<String> playertwo = new ArrayList<String>();
        ArrayList<String> playerthree = new ArrayList<String>();
        ArrayList<String> bottom = new ArrayList<String>();

        for (int x = 0; x < array.size(); x++){
            if (x>=array.size() -3 ){
                bottom.add(array.get(x));
            }
            else if (x%3 == 0){
                playerone.add(array.get(x));
            }
            else if (x%3 == 1){
                playertwo.add(array.get(x));
            }
            else if (x%3 == 2){
                playerthree.add(array.get(x));
            }
        }
        lookCards("玩家一",playerone);
        lookCards("玩家二",playertwo);
        lookCards("玩家三",playerthree);
        lookCards("底牌",bottom);

        //System.out.println("CARDS："+array);
    }
    public static void lookCards(String name,ArrayList<String> array){
        System.out.println(name+"的牌是：");
        for (String s : array){
            System.out.print(s +" ");
        }
        System.out.println();
    }
}
