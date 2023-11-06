package com.example.leetcode;

import java.sql.SQLOutput;
import java.util.ArrayList;

public class romanToInt {
    public romanToInt() {
    }
    public int convert(String x){
        int rs = 0;
        if(x.equalsIgnoreCase("i")){
            rs= 1;
        }
        if(x.equalsIgnoreCase("v")){
            rs= 5;
        }
        if(x.equalsIgnoreCase("x")){
            rs= 10;
        }
        if(x.equalsIgnoreCase("l")){
            rs= 50;
        }
        if(x.equalsIgnoreCase("c")){
            rs= 100;
        }
        if(x.equalsIgnoreCase("d")){
            rs= 500;
        }
        if(x.equalsIgnoreCase("m")){
            rs= 1000;
        }
        return rs;
    }
    public int romanToInt(String s){
        int rs = 0;
        String[]  strs = s.split("");
        ArrayList<Integer> strInt =  new ArrayList<>();
        int minusCell = 0;
        int sumCell = 0;
        int count = 0;
        for (int i = 0; i < strs.length; i++) {
                 strInt.add(convert(strs[i]));
                 if(i>0){
                     if(convert(strs[i])>1&&convert(strs[i-1])==1||
                             convert(strs[i])>10&&convert(strs[i-1])==10||
                             convert(strs[i])>100&&convert(strs[i-1])==100){
                         minusCell +=  convert(strs[i])-convert(strs[i-1]);
                         strInt.remove(strInt.size()-1);
                         strInt.remove(strInt.size()-2);
//                         System.out.println(strInt.get(strInt.size()-1));
//                         System.out.println(strInt.get(strInt.size()-2));
                     }
                 }
             }
        for (int i = 0; i < strInt.size(); i++) {
            sumCell+=strInt.get(i);
            System.out.println("sum"+strInt.get(i));
        }
        rs = minusCell+sumCell;
        return rs ;
    }
}
