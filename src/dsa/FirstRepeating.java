package dsa;

import java.util.HashMap;

public class FirstRepeating {

    public static void main(String[] args) {

         /*Find the first repeating number in an array
    Input: arr[] = {10, 5, 3, 4, 3, 5, 6}
    Output: 5*/

        int[] arr = new int[]{10, 5, 3, 4, 3, 5, 6};

        HashMap<Integer,Integer> map = new HashMap<>();

        for(int i = 0 ; i < arr.length ; i++)
        {
            if(map.containsKey(arr[i]))
            {
                int count = map.get(arr[i]);
                count++;
                map.put(arr[i],count);
            }
            else
            {
                map.put(arr[i],1);
            }
        }

        for(int i = 0 ; i < arr.length ; i++)
        {
            if(map.get(arr[i]) > 1) {
                System.out.println("First repeating is " + arr[i]);
                break;
            }
        }
    }
}
