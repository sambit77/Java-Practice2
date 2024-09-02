package dsa;

import java.util.Arrays;

public class MoveZeroToEnd {
    public static void main(String[] args) {

        int[] arr = new int[]{1,6,0,3,8,9,0,2};
        int right = arr.length-1;
        for(int i = 0 ; i < right ; i++)
        {
            if(arr[i] == 0)
            {
                arr[i] = arr[right];
                arr[right] = 0;
                right--;
            }
        }

        System.out.println("After Moveing zero to end");
        System.out.println(Arrays.toString(arr));
    }
}
