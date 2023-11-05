package com.example.leetcode;

public class main {

    public static void main(String[] args) {
        twoSum ts = new twoSum();
        int [] intput = {2,7,11,15};
        int target = 9;
        int []  rs = ts.twoSum(intput,target);
        for (int i = 0; i <rs.length; i++) {
            System.out.println("check: "+rs[i]);
        }
    }
}
