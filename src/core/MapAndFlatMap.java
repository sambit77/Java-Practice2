package core;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MapAndFlatMap {

    public static void main(String[] args) {

        HashMap<String, List<Integer>> phoneBook = new HashMap<>();

        phoneBook.put("Sambit", Arrays.asList(5463,8890));
        phoneBook.put("Ogni", Arrays.asList(786,1234));
        phoneBook.put("Pand", Arrays.asList(93,90));

        //flatmap example

        List<Integer> allNums = phoneBook.values().stream()
                .flatMap(Collection::stream).collect(Collectors.toList());

        System.out.println("All PhoneNums");
        for(int num : allNums)
        {
            System.out.print(num+" ");
        }

        List<Stream<Integer>> allNums2D = phoneBook.values().stream()
                .map(Collection::stream).collect(Collectors.toList());

        System.out.println("All Phone nums 2");

        for(Stream<Integer> s : allNums2D)
        {
            List<Integer> num  = s.collect(Collectors.toList());
            System.out.println(num);
        }

    }
}
