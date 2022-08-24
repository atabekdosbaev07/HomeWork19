package com.company;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {

        Integer[] a = {1,2,3,4,5,6,7,8,19};
        System.out.print("Жуп сандар: ");
        Arrays.stream(a).filter(x -> x % 2 == 0).forEach(x -> System.out.print(x+" "));

       Integer integer = Arrays.stream(a)
                .filter(x -> x % 2 == 0)
                .map(x -> x * x)
                .max(Integer::compareTo)
                .get();
        System.out.println("\nМакс. квадрат жуп сан: "+integer);




    }
}