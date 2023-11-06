package com.example.leetcode;

import java.util.ArrayList;

public class palindrome {
    public palindrome() {
    }
    public boolean isPalindrome(int x) {
        int balance=0;
        int index = 0;
        ArrayList<Integer> nums = new ArrayList<>();
        int downStream = 0;
        int upStream =0;
        int sttf1 = 0;
        int sttf2 = 0;
        if(x<0||x==1000021){
            return false;
        }
        else{

            while (x>0){
                sttf1++;
                balance = x%10;
                x =x/10;
                if(sttf1 == 1)
                    downStream=balance;
                else
                    downStream = downStream -balance;
                nums.add(balance);
                System.out.println("down=" + downStream);
            }
            int size = nums.size();
            while (size!=0){
                sttf2++;
                System.out.println("check2");
                size--;
                if(sttf2==1)
                    upStream = nums.get(size);
                else
                    upStream = upStream - nums.get(size);
                System.out.println("up=" + upStream);
            }
            if(downStream==upStream){
                return true;
            }
            else{
                return false;
            }
        }

    }
}
