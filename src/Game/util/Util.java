package Game.util;
public class Util {


    public static void sort(String[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            String temp;
            boolean x = true;//假定有序
            for (int j = 0; j < arr.length - i - 1; j++) {

                if (arr[j].compareTo(arr[j + 1]) > 0) {
                    temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    x = false;
                }
                if (x) {
                    break;//跳出循环，减少for循环次数
                }
            }
        }
    }
}
