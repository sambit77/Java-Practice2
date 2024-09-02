package dsa;

import java.util.Arrays;

public class MergeTwoSortedArray {

     /*Given two sorted arrays. Merge them and return the merged sorted array.
                I/P - [1,4,6,7], [2,3,5]
        O/P - [1,2,3,4,5,6,7]*/

    public static void main(String[] args) {
        int[] arr1 = new int[]{1,4,6,7};
        int[] arr2 = new int[]{2,3,5};
        System.out.println("Input Array 1 "+Arrays.toString(arr1));
        System.out.println("Input Array 2 "+Arrays.toString(arr2));

        int[] merged = getSortedArray(arr1,arr2);

        System.out.println("Merge sorted array is "+ Arrays.toString(merged));

        System.out.println("Merge and populate  input arrays do not use extra array ");

        int left = arr1.length-1;
        int right = 0;

        while(left >= 0 && right < arr2.length)
        {
            if(arr1[left] > arr2[right])
            {
                int temp = arr1[left];
                arr1[left] = arr2[right];
                arr2[right] = temp;
            }
            else {
                break;
            }
            left--;
            right++;
        }

        Arrays.sort(arr1);
        Arrays.sort(arr2);

        System.out.println("Sorted Array 1 "+Arrays.toString(arr1));
        System.out.println("Sorted Array 2 "+Arrays.toString(arr2));
    }

    public static  int[] getSortedArray(int[] arr1,int[] arr2)
    {
        int n = arr1.length + arr2.length;
        int[] merged = new int[n];

        int left = 0;
        int right = 0;
        int index = 0;

        while ((left < arr1.length && right < arr2.length))
        {
            if(arr1[left] < arr2[right])
            {
                merged[index] = arr1[left];
                left++;
                index++;
            }
            else
            {
                merged[index] = arr2[right];
                right++;
                index++;
            }
        }

        while (left < arr1.length)
        {
            merged[index] = arr1[left];
            left++;
            index++;
        }

        while (right < arr2.length)
        {
            merged[index] = arr2[right];
            right++;
            index++;
        }

        return  merged;

    }
}
