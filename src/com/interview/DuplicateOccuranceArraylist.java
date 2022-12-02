package com.interview;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class DuplicateOccuranceArraylist {
    public static void main(String[] args){
        List<String> li = new ArrayList<String>();
        li.add("s");
        li.add("i");
        li.add("s");
        li.add("k");
        li.add("i");
        System.out.println(li);
        int a = Collections.frequency(li,"s");
        System.out.println(a);
        String s= li.stream().collect(Collectors.groupingBy(c->c,Collectors.counting())).toString();
        System.out.println(s);
    }




}

