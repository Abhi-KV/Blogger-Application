package com.blog;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MainUtil5 {
    public static void main(String[] args) {
//        List<Integer> num = Arrays.asList(100,500,5,4000,5000,10000,2000);
//        Integer maxVal = num.stream().max(Integer::compareTo).get();
//        Integer minVal = num.stream().min(Integer::compareTo).get();
//        System.out.println(maxVal);
//        System.out.println(minVal);

//        converting all names to uppercase
        List<String> names = Arrays.asList("mike","stallin","adam","mithun");
        List<String> upperCase = names.stream().map(n -> n.toUpperCase()).collect(Collectors.toList());
        System.out.println(upperCase);
    }
}
