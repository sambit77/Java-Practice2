package dsa;

import java.util.Arrays;

public class LongestSubstringWithoutRepeatingChar {

    public static void main(String[] args) {

        String str = "cadbzabcd";
        int len = getLongestLen(str);
        int len2 = getLongestLenOptimal(str);

        System.out.println("Length of longest string without repeating char "+len2);
    }

    private static int getLongestLenOptimal(String str) {

        int maxLen = 0;
        int[] hash = new int[255];
        Arrays.fill(hash, -1);

        int l  = 0;
        int r = 0;
        int n = str.length();

        while( r < n)
        {
            char ch = str.charAt(r);
            if(hash[ch] != -1)
            {
                if(hash[ch] >= l)
                {
                    l = hash[ch]+1;
                }
            }
            int len = r - l + 1;
            maxLen = Math.max(len,maxLen);
            hash[ch]=r;
            r++;
        }




        return  maxLen;
    }

    private static int getLongestLen(String str) {
        int maxLen = 0;
        int[] hash = new int[256];
        for(int i = 0; i < str.length() ; i++)
        {
            StringBuilder sub = new StringBuilder();
            for(int j = i; j < str.length() ; j++)
            {
                sub.append(str.charAt(j));
                if(hash[str.charAt(j)]  < 1)
                {
                    int len = j-i+1;
                    maxLen = Math.max(len,maxLen);
                }
                hash[str.charAt(j)]=1;

            }
        }

        return  maxLen;
    }
}
