package cls.part3;

public class Homework32 {
//    请编写程序，实现对数组{25,24,12,76,101,96,28} 的排序。冒泡排序
    public static void main(String[] args) {
        int[] arr={25,24,12,76,101,96,28};
        int temp=0,i=0,j=0;
        for (i=0;i< arr.length;i++){
            for (j=i+1;j<arr.length;j++){
                if (arr[i]>=arr[j]) {
                    temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
        }
        System.out.print("{");
        for (i=0;i<arr.length-2;i++) {
            System.out.print(arr[i] + ",");
        }
        int length= arr.length-1;
        System.out.print(arr[length]+"}");
    }

}
