package Algorithms.sorting;

public class QuickSort {

    public static void quickSort(int[] arr, int low, int high) {
        if (low < high) {
            int partitionIdx = partition(arr, low, high);
            quickSort(arr, low, partitionIdx - 1);
            quickSort(arr, partitionIdx+1, high);
        }
    }

    public static int partition(int[] arr, int low,
                                int high) {
        int pivot = arr[low];
        int i = low;
        int k = high;
        while (i < k) {
            while (arr[i] <= pivot && i <= high) {
                i++;
                if(i>high)
                    break;
            }
            while (arr[k] > pivot && k >= low) {
                k--;
                if(k<low)
                    break;
            }
            if (i < k) {
                int temp = arr[i];
                arr[i] = arr[k];
                arr[k] = temp;
            }
        }
        int pivotTemp = arr[low];
        arr[low] = arr[k];
        arr[k] = pivotTemp;
        return k;

    }
    public static int[] quickSortAction(int[] arr) {
        quickSort(arr, 0, arr.length - 1);
        return arr;
    }

    public static void main(String[] args) {
        int[] arr = {4, 6, 2, 5, 7, 9, 1, 3};
        int n = arr.length;
        System.out.println("Before Using Quick Sort: ");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        arr =quickSortAction(arr);
        System.out.println("After Quick sort: ");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }


}
