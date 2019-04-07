package com.sforce.server.config;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

class TopKFrequent {
    public List<Integer> topKFrequent(int[] nums, int k) {
        List<Integer> topK = new ArrayList<Integer>();
        Map<Integer, MyInteger> numsMap = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            if(numsMap.get(new Integer(nums[i])) != null) {
                ((MyInteger)numsMap.get(new Integer(nums[i]))).count += 1; 
            }
        }
        List<MyInteger> mynums = new ArrayList<>(numsMap.values());
        Collections.sort(mynums);
        Iterator<MyInteger> ite = mynums.iterator();
        int i =0;
        while(ite.hasNext()) {
        	topK.add(ite.next().count);
        	i++;
        }
        return topK;
    }
    
    private class MyInteger implements Comparable {
        public int value;
        public int count;
        
        public MyInteger(int value1, int count1) {
            value = value1;
            count = count1;
        }

        @Override
		public int compareTo(Object o) {
            if(this.count > ((MyInteger)o).count) {
                return 1;
            } else {
                return 0;
            }
		}
        
    }
}


