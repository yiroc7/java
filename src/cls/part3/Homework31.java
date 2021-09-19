package cls.part3;

public class Homework31 {
    public static void main(String[] args) {
//用for计算1-100中能被3整除的数的和
        int i=1,sum1=0;//定义变量i和sum1
        for(i=1;i<=100;i++)//for循环从1取到100取出能整除3的数加到sum1
        {
            if(i%3==0)//用if条件语句判断
            {
                sum1+=i;//从1取到100取出能整除3的数加到sum1
            }
        }
        System.out.println("用for计算1-100中能被3整除的数的和sum1="+sum1);//输出sum1的值
//用while计算1-100中能被3整除的数的和
        int j=1,sum2=0;
        while(j<=100){
            if(j%3==0){
                sum2+=j;//从1取到100取出能整除3的数加到sum2
            }
            j++;//while循环从1取到100取出能整除3的数加到sum2,每次循环j加1
        }
        System.out.println("用while计算1-100中能被3整除的数的和sum2="+sum2);
    }
}
