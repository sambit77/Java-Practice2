package core;

import java.util.Scanner;
import java.util.function.Function;
import java.util.function.Predicate;

public class FunctionAndPredicate {
    public static void main(String[] args) {

        System.out.println("Enter your age");

        Scanner sc = new Scanner(System.in);
        int ageInput = sc.nextInt();
        Predicate<Integer> predicate = age -> age >=18;

        if(predicate.test(ageInput))
        {
            System.out.println("Eligible for voting");
        }
        else
        {
            System.out.println("Not Eligible for voting");
        }

        Function<Integer,String> getMessage = (age) -> {
          if(age <= 0)
          {
              return "Invalid Age";
          }
          else
          {
              return  "valid age "+age+"years old";
          }
        };

        String msg = getMessage.apply(ageInput);
        System.out.println(msg);

    }
}
