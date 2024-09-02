package dsa;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class LeadersInArray {

    public static void main(String[] args) {

        //Find the king element in O(n) time complexity IP: [31,4,7,15,1,8,9] OP: [31,15,9]

        int[] arr = new int[]{31,4,7,15,1,8,9};

        List<Integer> leaders = getLeadersWay1(arr); //O(n^2)
        System.out.println("Leaders O(n^2) time"+leaders.toString());

        //approach2
        List<Integer> leaders2 = getLeadersWay2(arr); //O(n)
        System.out.println("Leaders O(n) time "+leaders2.toString());


    }

    private static List<Integer> getLeadersWay2(int[] arr) {
        List<Integer> al = new ArrayList<>();

        int rightMax = arr[arr.length-1];
        al.add(rightMax);
        for(int i = arr.length-2 ; i>= 0 ; i--)
        {
            if(arr[i] > rightMax)
            {
                rightMax = arr[i];
                al.add(arr[i]);
            }
        }

        Collections.reverse(al);
        return al;

    }

    private static List<Integer> getLeadersWay1(int[] arr) {
        List<Integer> al = new ArrayList<>();

        for(int i = 0 ; i < arr.length ; i++)
        {
            boolean leader = true;
            for(int j = i+1 ; j < arr.length ; j++)
            {
                if(arr[i] < arr[j])
                {
                    leader = false;
                    break;
                }
            }
            if(leader)
            {
                al.add(arr[i]);
            }
        }
        return  al;
    }
}
