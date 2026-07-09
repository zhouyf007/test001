 // 冒泡排序类
public class BubbleSort {
    public static void main(String[] args) {
        // 待排序的数组
        int[] arr = {64, 34, 25, 12, 22, 11, 90};
        
        System.out.println("排序前：");
        printArray(arr);
        
        bubbleSort(arr);
        
        System.out.println("排序后：");
        printArray(arr);
    }
    
    // 冒泡排序算法实现
    public static void bubbleSort(int[] arr) {
        // 获取数组长度
        int n = arr.length;
        // 外层循环：控制排序轮数
        for (int i = 0; i < n - 1; i++) {
            // 内层循环：相邻元素两两比较
            for (int j = 0; j < n - 1 - i; j++) {
                // 如果前一个元素大于后一个，则交换
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }
    
    // 打印数组元素
    public static void printArray(int[] arr) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
