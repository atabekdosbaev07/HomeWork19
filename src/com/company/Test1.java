package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Test1 {
    public static void main(String[] args) {
        List <String> list = new ArrayList<>();
        list.add("Privet");
        list.add("kak dela");
        list.add("ok");
        list.add("poka");

//        for (int i = 0; i < list.size(); i++) {
//            list.set(i,String.valueOf(list.get(i).length()));
//          }
        List<Integer> list3 = list.stream().
                map(elem->elem.length()).collect(Collectors.toList());

        System.out.println(list3);

        int[] ar = {2,9,5,6,7,5};
        ar = Arrays.stream(ar).map(x-> { if (x % 3 == 0) { x = x / 3; }return x;}).toArray();
        System.out.println(Arrays.toString(ar));
    }
}
