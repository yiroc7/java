package cls1.syp;

import java.net.SocketOption;

public class MarketList {
    public static void main(String[] args) {
        //MacBookAir
        String brand1="MacBookAir";
        double size1=13.3;
        double price1=6988.88;
        String config1="i5处理器4G内存128G固态硬盘";
        int count1=5;
        //ThinkpadT450
        String brand2="ThinkpadT450";
        double size2=14.0;
        double price2=5999.99;
        String config2="i5处理器4G内存500G硬盘";
        int count2=10;
        //ASUS-FL5800
        String brand3="ASUS-FL5800";
        double size3=15.6;
        double price3=4999.5;
        String config3="i7处理器4G内存128G固态硬盘";
        int count3=18;
        //总计信息
        int totalcount=0;
        double totalprice=0;
        totalcount=count1+count2+count3;
        totalprice=price1+price2+price3;
        System.out.println("---------------------------商城库存清单---------------------------\n" +
                           "品牌型号        尺寸      价格      配置                     库存数" );
        System.out.println(brand1+"    "+size1+"    "+price1+"  "+config1+"        "+count1);
        System.out.println(brand2+"  "+size2+"    "+price2+"  "+config2+"          "+count2);
        System.out.println(brand3+"   "+size3+"    "+price3+"   "+config3+"        "+count3+"");
        System.out.println("----------------------------------------------------------------");
        System.out.println("总库存数："+totalcount+"\n"+"库存商品总金额："+totalprice);
    }
}
