package com.interview;

import java.util.HashSet;
import java.util.Set;

public class IntArrayJoinTest {
    public static void main(String[] args){
        int[] ar = {1,3,4,5,6};
        int[] ar1 = {2,9,8,5,3,4};
        findOccurance(ar,ar1);
        findUnion(ar,ar1);

    }
    static void findUnion(int ar[],int ar1[]){
        Set<Integer> st = new HashSet<Integer>();
        for(int i=0;i<ar.length;i++){
            st.add(ar[i]);
        }
        for(int i=0;i<ar1.length;i++){
            st.add(ar1[i]);
        }
        System.out.println(st);
    }
    static void findOccurance(int ar[],int ar1[]){
        Set<Integer> s1 = new HashSet<>();
        for(int i=0;i<ar.length;i++){
            s1.add(ar[i]);
        }
        for(int i=0;i<ar1.length;i++){
            if(s1.contains(ar1[i])){
                System.out.println(ar1[i]);
            }
        }


    }
}
