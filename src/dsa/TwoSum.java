package dsa;

import java.util.HashMap;

public class TwoSum {
    //assuming each input have exactly one solution --leetcode ques
    public int[] twoSum(int[] nums, int target) {

        HashMap<Integer,Integer> map = new HashMap<Integer, Integer>();

        for(int i = 0 ; i < nums.length ; i++)
        {
            int lookUp = target - nums[i];

            if(map.containsKey(lookUp))
            {
                return  new int[]{map.get(lookUp),i};
            }

            map.put(nums[i],i);

        }

        return null;

    }
}
