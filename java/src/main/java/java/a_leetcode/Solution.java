package java.a_leetcode;

import java.util.*;

/**
 * /**
 *
 * Copyright (c) 2004-2017 All Rights Reserved.
 *
 * @author dz on 2018/10/11.
 */
public class Solution {

    public int[] twoSum(int[] nums, int target) {

        Map<Integer,Integer> map = new HashMap();

        for (int i = 0; i < nums.length; i++) {
            Integer index = map.get(target - nums[i]);
            if(index == null ){
                map.put(nums[i],i);
            }else{
                return new int[]{i,index};
            }
        }

        return new int[]{0,0};
    }

    public static void main(String[] args) {

        int[] num = new int[]{-2 ,0 ,2, 2 ,-1, 3};

        List<List<Integer>> result = testArraySum(num,0);

        System.out.println(result.toString());

    }


    public static List<List<Integer>> testArraySum(int[] num,int target){

         List<List<Integer>> ret = new ArrayList<>();
         int len  = num.length;

         if(len <= 2){
             return ret;
         }

         Arrays.sort(num);

         for(int i = 0;i<= len -3;i++){

             int j = i+1;
             int k = len-1;
             while(j < k){

                 if(num[i] + num[j] + num[k] < target){

                     ++j;
                 }else if(num[i] + num[j] + num[k] > target){

                     --k;
                 }else{
                     ret.add(Arrays.asList(num[i],num[j],num[k]));
                     ++j;
                     --k;

                     while(j< k && num[j] == num[j-1]){

                         ++j;
                     }

                     while(j < k && num[k] == num[k+1]){

                         --k;
                     }
                 }


             }
            while(i <= len-3 && num[i] == num[i +1 ]){
                ++i;
            }

         }


         return ret;
    }
}
