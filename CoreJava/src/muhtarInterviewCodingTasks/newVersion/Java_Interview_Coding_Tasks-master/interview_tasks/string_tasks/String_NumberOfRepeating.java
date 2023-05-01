package string_tasks;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class String_NumberOfRepeating {

    /*
        Find the number of these a word /number got repeated
            Example1:
                Input:5,3,4,1,3,7,2,9,9,4
                output:1-1,2-1,3-2,4-2,5-1,7-1,9-2

            Example2:
                Input:"Amanda","John","Alex","Amanda","John"
                Output: John-2 ,Alex-1  ,Amanda-2
     */


    public static void main(String[] args) {

        List<Integer> numList = Arrays.asList(5,3,4,1,3,7,2,9,9,4);
        List<String> stringList=Arrays.asList("Amanda","John","Alex","Amanda","John");

        Map<Integer,Long> output= numList.stream().collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));

        output.forEach((Key, value) -> {
            System.out.println(Key + " - " +value);
        });
        Map<String,Long> output2= stringList.stream().collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));


        output2.forEach((Key, value) -> {
            System.out.println(Key + " - " +value);
        });
    }

}
