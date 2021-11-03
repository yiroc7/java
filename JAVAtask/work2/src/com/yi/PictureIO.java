package com.yi;

import java.io.*;

public class PictureIO {
    public static void main(String[] args) {
        try {
            //创建带缓冲区的输入流
            FileInputStream fis = new FileInputStream("C:\\learn\\java\\JAVAtask\\JAVAfile\\source\\picture.jpg");
            BufferedInputStream bis = new BufferedInputStream(fis);
            //创建带缓冲区的输入流
            FileOutputStream fos = new FileOutputStream("C:\\learn\\java\\JAVAtask\\JAVAfile\\target\\copypicture.jpg");
            BufferedOutputStream bos = new BufferedOutputStream(fos);
            //开始时间
            long begintime= System.currentTimeMillis();
            //定义一个int类型的变量记录读取读入缓冲区的字节数
            int n= 0;
            while((n=bis.read())!=-1) { //将图片读出存入缓存区
                bos.write(n);  //图片写入缓存区
            }

            bis.close();
            bos.close();

            long endtime= System.currentTimeMillis();

            System.out.println("拷贝图片所用的时间是:"+(endtime-begintime)+"ms");
        } catch (FileNotFoundException e) {
                    e.printStackTrace();
        }catch (IOException e) {
                    e.printStackTrace();
        }

    }
}

