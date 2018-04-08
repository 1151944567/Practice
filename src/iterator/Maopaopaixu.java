package iterator;
/**
 * 冒泡排序法的最终优化版
 */

import java.util.Arrays;

public class Maopaopaixu {
    public static void sort(int[] arr){
        for (int i = 0;i<arr.length-1;i++){
            boolean x =true;//假定有序
            for (int j = 0;j<arr.length-i-1;j++){
                if (arr[j]>arr[j+1]){
                    arr[j]=arr[j]+arr[j+1];
                    arr[j+1]=arr[j]-arr[j+1];
                    arr[j]=arr[j]-arr[j+1];
                    x=false;//若发生交换则无序，因为是前一个和后一个比较，
                    // 然后下标依次增加，也就是1<2,2<3,3<4,4<5；
                    // 也就是整个数组有序了，但是如果发生了就还是无序，所以false;
                }
            }
            if (x){
                break;//跳出循环，减少for循环次数
            }
        }
    }
    public static void main(String[] args) {
        int[] arr = {1, 9, 7, 62, 19, 44, 33};
        sort(arr);
        System.out.println(Arrays.toString(arr));

    }


}
