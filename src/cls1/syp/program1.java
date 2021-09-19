package cls1.syp;

import java.net.SocketOption;

public class program1 {
    public static void main(String[] args) {
        System.out.println("你好！");
        System.out.println("我就是" +
                "太阳！");//理性消费
        /*这是一个字符串
        表示方法。
         */
        int y = 2, x = 0;
        y = x + y;
        System.out.println("y=2," +"x=0时,"+"y+x="+y);
        System.out.println(y + "B");
        long num=2200000L;
        float f=23.009f;
        boolean flag=true;
        byte a=2;
        int c=a;
        int b=2;
        byte d=(byte) b;
        System.out.println(c);
        System.out.println(d);
    }
}
class Person{
    int age;
    void speak(){
        int age=69;
        System.out.println("年龄："+age);
    }
}