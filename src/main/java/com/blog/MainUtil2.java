package com.blog;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MainUtil2 {
    public static void main(String[] args) {
        List<Integer> data= Arrays.asList(10,5,2,20);
        List<Double> newData = data.stream().map(n -> (double)n * n/2).collect(Collectors.toList());
        System.out.println(newData);
//        sorted
        List<Integer> sortedData = data.stream().sorted().collect(Collectors.toList());
        System.out.println(sortedData);

        List<String> names = Arrays.asList("mike","adam","stallin","mithun");
        List<String> sortedString = names.stream().sorted().collect(Collectors.toList());
        System.out.println(sortedString);
//        distinct
        List<Integer> numbers= Arrays.asList(10,2,10,34,22,2,5);

        List<Integer> distinctNum = numbers.stream().distinct().sorted().collect(Collectors.toList());
        System.out.println(distinctNum);

    }
}




