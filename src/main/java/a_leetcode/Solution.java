package a_leetcode;

import java.util.HashMap;
import java.util.Map;

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
}
