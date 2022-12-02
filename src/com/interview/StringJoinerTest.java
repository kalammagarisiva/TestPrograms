package com.interview;

import java.util.StringJoiner;

public class StringJoinerTest {
    public static void main(String[] args){
        StringJoiner sj1 = new StringJoiner(",", "[","]");
        sj1.add("k").add("si").add("va");
        StringJoiner sj2 = new StringJoiner(":");
        sj2.add("p").add("q");
        sj1.merge(sj2);
        System.out.println(sj1);
    }
}
