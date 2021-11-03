package com.yi;

import java.io.*;

public class TxtIO {
    public static void main(String[] args) {
        try {
            FileReader reader = new FileReader("C:\\learn\\java\\JAVAtask\\JAVAfile\\source\\word.txt");
            //创建一个BufferedReader缓冲对象
            BufferedReader br = new BufferedReader(reader);

            FileWriter writer = new FileWriter("C:\\learn\\java\\JAVAtask\\JAVAfile\\target\\copyword.txt");
            //创建一个BufferedWriter缓冲对象
            BufferedWriter bw = new BufferedWriter(writer);
            //开始时间
            long begintime= System.currentTimeMillis();
            //定义字符串记录读取读入缓冲区的字符
            String str;
            while ((str = br.readLine())!= null) {
                bw.write(str);
                bw.newLine();
            }

            br.close();
            bw.close();

            long endtime= System.currentTimeMillis();
            System.out.println("拷贝目标TXT所用的时间是:"+(endtime-begintime)+"ms");
        }catch (FileNotFoundException e) {
            e.printStackTrace();
        }catch (IOException e) {
            e.printStackTrace();
        }
    }
}
