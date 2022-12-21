public class SelectionSort {
    //選擇排序法
    public static void selectionSort(int[] arr){
        int minIndex;
        for (int i = 0; i < arr.length; i++) {
            minIndex = i;
            for (int j = i+1; j < arr.length; j++) {
                if (arr[j] < arr[minIndex]){
                    minIndex = j;
                }
            }
            int temp = arr[i];    //arr[i]與arr[minIndex]交換
            arr[i] = arr[minIndex];
            arr[minIndex] = temp;
        }
    }
    public static void main(String[] args) {
        int[] array ={9,8,6,4,3,7};
        System.out.println("Original Array:");
        for (int i:array){
            System.out.print(i+" ");
        }
        System.out.println();
        selectionSort(array);
        System.out.println("After sort:");
        for (int i : array){
            System.out.print(i+" ");
        }
    }

}
