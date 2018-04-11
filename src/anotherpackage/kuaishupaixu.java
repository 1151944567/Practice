package anotherpackage;
import java.math.*;
import java.util.Arrays;

public class kuaishupaixu {
    public static void sort(int[] a,int low,int high){
        int start = low;
        int end = high;
        int key = a[low];


        while(end>start){
            //从后往前比较
            while(end>start&&a[end]>=key)  //如果没有比关键值小的，比较下一个，直到有比关键值小的交换位置，然后又从前往后比较
                end--;
            if(a[end]<=key){
                int temp = a[end];
                a[end] = a[start];
                a[start] = temp;
            }
            //从前往后比较
            while(end>start&&a[start]<=key)//如果没有比关键值大的，比较下一个，直到有比关键值大的交换位置
                start++;
            if(a[start]>=key){
                int temp = a[start];
                a[start] = a[end];
                a[end] = temp;
            }
            //此时第一次循环比较结束，关键值的位置已经确定了。左边的值都比关键值小，右边的值都比关键值大，但是两边的顺序还有可能是不一样的，进行下面的递归调用
        }
        //递归
        if(start>low) sort(a,low,start-1);//左边序列。第一个索引位置到关键值索引-1
        if(end<high) sort(a,end+1,high);//右边序列。从关键值索引+1到最后一个
    }
    public static void quicksort(int[]arr,int low,int hight){
        int pos;
        if (low<hight){
            pos=findPos(arr,low,hight);
            quicksort(arr,low,pos-1);
            quicksort(arr,pos+1,hight);
        }
    }
    public static int  findPos(int[]arr,int low,int hight){
             int val=arr[low];
             while(low<hight){  //再一次快速排序中只要low的值比hight小，我们就应该去移动，因为当前这次排序还没有完成
                     while(low<hight&&arr[hight]>=val){  //表示只有当前指针没有重合并且当前右边hight指向的值大于val时，才会向左移动hight
                             hight=hight-1;
                         }
                     arr[low]=arr[hight];  //将比val小的值赋到low
                     while(low<hight&&arr[low]<=val){
                             low=low+1;
                         }
                     arr[hight]=arr[low];  //将比val大的值赋到hight上
                 }
             arr[low]=val;
             return hight;//找到了所属的位置，并且将我们选定的值val赋到这个位置上去
         }

    public static void main(String[] args) {
        int a[] = {11,1,44,33,22,9,7};
        sort(a,0,a.length-1);
        System.out.println(Arrays.toString(a));
    }
}
