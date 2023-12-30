package com.blog;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MainUtil {
    public static void main(String[] args) {
//        List<Integer> data= Arrays.asList(10,20,30,5,50,100);
//        List<Integer> newData = data.stream().filter(x -> x > 20).collect(Collectors.toList());
//        System.out.println(newData);

//        List<String> data = Arrays.asList("mike","stallin","mithun","adam","micheal");
//        List<String> newData = data.stream().filter(x -> x.startsWith("m")).collect(Collectors.toList());
//        System.out.println(newData);

//        List<String> data = Arrays.asList("mike","stallin","mithun","adam","micheal");
//        List<String> newData = data.stream().filter(x -> x.endsWith("n")).collect(Collectors.toList());
//        System.out.println(newData);

//        List<String> data = Arrays.asList("mike","stallin","mike","adam","micheal");
//        List<String> newData = data.stream().filter(x -> x.equals("mike")).collect(Collectors.toList());
//        System.out.println(newData.size());
        MainUtil mainUtil = new MainUtil();
        mainUtil.test();



    }

    public void test() {
        System.out.println(100);
    }
}
