package com.test;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class TestHashMap {
    public static void main(String[] args){
        Map mp = new HashMap();
        mp.put(1,"andhra");
        mp.put(2,"bat");
        mp.put(3,"chennai");
        mp.put(4,"delhi");
        mp.put(5,"delhi");
       // mp.put(null,"delhi");
       // mp.put(null,"EC");
        Iterator mt = mp.entrySet().iterator();
        while(mt.hasNext()){
            System.out.println(mt.next());
        }
        for(Object entry : mp.keySet()){
            System.out.println(entry);

        }
        System.out.println(mp);

        mp.entrySet().stream().forEach(s-> System.out.println(s));
        mp.values().stream().forEach(s->System.out.println(s));
    }
}
