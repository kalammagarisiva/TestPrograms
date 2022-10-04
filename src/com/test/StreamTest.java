package com.test;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamTest {
  public static void main(String[] args) {
    ArrayList<String> ar = new ArrayList<String>();
    ar.add("added");
    ar.add("ball");
    ar.add("chennai");
    ar.add("delhi");
    ar.add("ECS");
    Set st5 = new HashSet();
    st5.addAll(ar);
    System.out.println("111111"+st5);
    Iterator<String> itr = ar.iterator();
    while (itr.hasNext()) {
      System.out.println(itr.next());
    }
    List st1 = ar.stream().collect(Collectors.toList());
    Set st = ar.stream().collect(Collectors.toSet());
    System.out.println(st);

     ar.stream().forEach(s -> System.out.println(s.length()));

     List mapList = ar.stream().map(s -> s+"a").collect(Collectors.toList());
     mapList.stream().forEach(s -> System.out.println(s));

     ar.stream().filter(s -> s.length()>6).collect(Collectors.toList());
  }
}
