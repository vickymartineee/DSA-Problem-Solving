package Algorithms.sorting;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class MergeSort {
    public static void mergeSort(int[] a, int start, int end) {
        if (start >= end) {
            return;
        }
        int midpoint = (start + end) / 2;
        mergeSort(a, start, midpoint);
        mergeSort(a, midpoint + 1, end);
        mergeArr(a, start, midpoint, end);
    }

   /* public static void mergeArr(int[] a, int start, int mid, int end) {
        List<Integer> temp = new ArrayList<>();
        int right = mid+1;
        int left = start;
        int i = 0;
        while (left <= mid && right <= end) {
            if (a[left] <= a[right]) {
                temp.add(a[left]);
                left++;
            } else {
                temp.add(a[right]);
                right++;
            }
        }
        while (left <= mid) {
            temp.add(a[left]);
            left++;
        }
        while (right <= end) {
            temp.add(a[right]);
            right++;
        }
        for (int j = start; j <= end; j++) {
            a[j] = temp.get(j-start);
        }
    }*/


    public static void mergeArr(int[] a, int start, int mid, int end) {
        List<Integer> temp = new ArrayList<>();
        int right = mid+1;
        int left = start;
        int i = 0;
        while (left <= mid && right <= end) {
            if (a[left] <= a[right]) {
                temp.add(a[left]);
                left++;
            } else {
                temp.add(a[right]);
                right++;
            }
        }
        while (left <= mid) {
            temp.add(a[left]);
            left++;
        }
        while (right <= end) {
            temp.add(a[right]);
            right++;
        }
        for (int j = start; j <= end; j++) {
            a[j] = temp.get(j-start);
        }
    }
    public static void printArr(int[] arr) {

        if (Objects.nonNull(arr)) {
            System.out.print("[");
            for (int a : arr) {
                System.out.print(a + " ");
            }
            System.out.print("]");
        }
    }


    public static void main(String[] args) {
        int[] sampleArr = {9, 2, 5, 3, 6, 2, 5, 6};
        mergeSort(sampleArr, 0, sampleArr.length-1);
        printArr(sampleArr);
    }
}
