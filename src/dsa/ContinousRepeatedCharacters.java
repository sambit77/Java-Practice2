package dsa;

import java.util.HashMap;

public class ContinousRepeatedCharacters {

    public static void main(String[] args) {
        /*Count continuous repeated occurrence of characters from String
    Input – aaabbcccaab
    Output – a3b2c3a2b1*/

        String input = "aaabbcccaab";


        char ch1 = input.charAt(0);
        int count = 1;

        StringBuilder sb = new StringBuilder();
        for(int i = 1 ; i < input.length() ; i++)
        {
            char current = input.charAt(i);
            if(current == ch1)
            {
                count++;
            }
            else
            {
                sb.append(ch1);
                sb.append(count);
                count = 0;
                ch1 = current;
            }

        }

        System.out.println(sb);

        HashMap<Character,Integer> map = new HashMap<>();
        for(int i = 0 ; i < input.length() ; i++)
        {
            char ch = input.charAt(i);
            if(map.containsKey(ch))
            {
                int cnt = map.get(ch);
                cnt++;
                map.put(ch,cnt);
            }
            else
            {
                map.put(ch,1);
            }
        }

        for(Character ch : map.keySet())
        {
            System.out.print(ch+""+map.get(ch));
        }



    }
}
