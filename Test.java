package com.walmart.services.itemingestion;

import java.util.LinkedHashMap;
import java.util.Map;

public class Test {
    public static void main(String[] args){
        String str= "siva";
        char[] chr = str.toCharArray();
        StringBuilder st = new StringBuilder();
        for(int i=0; i<chr.length;i++){
            System.out.println(chr[i]);
        }
        for(int i=chr.length-1;i>=0;i--){
            System.out.println(chr[i]);
            st.append(chr[i]);

        }
        System.out.println(st);
        checkNonRepeatedChar("stress");
    }

    public static void checkNonRepeatedChar(String str){
        Map<Character,Integer> map = new LinkedHashMap<Character,Integer>();
        char[] chaar = str.toCharArray();
        for(int i=0;i<chaar.length;i++){
            if(map.containsKey(chaar[i])){
                map.put(chaar[i],map.get(chaar[i])+1);
            }else{
                map.put(chaar[i],1);
            }
        }
        System.out.println(map);
        for(Map.Entry<Character, Integer> mp : map.entrySet()){
               if(mp.getValue()==2){
                   System.out.println("key is "+mp.getKey());
                   return;
               }
        }
    }

}
