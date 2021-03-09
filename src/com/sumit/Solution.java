package com.sumit;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Solution {
	
	public static List<Integer> getMedianOfElementsInArray(int[] a){
		
		List<Integer> tempList = new ArrayList<Integer>();
		List<Integer> output = new ArrayList<Integer>();
		int median;
		
		
		if(a.length==0 || a==null) 
		{
			return tempList;
		}
		
		if(a.length==1) 
		{
			tempList.add(a[0]);
			return tempList;
		}
		
		
		for(int i=0;i<a.length;i++) 
		{
			tempList.add(a[i]);
			
			if(tempList.size()==1) 
			{
				output.add(a[i]);
				continue;
			} 
			else if(tempList.size()%2==0) 
			{
				Collections.sort(tempList);
				median = (tempList.get(tempList.size()/2)+tempList.get((tempList.size()/2)-1))/2;
				output.add(i, median);			
			}
			else if(tempList.size()%2!=0) 
			{
				Collections.sort(tempList);
				median = (tempList.get(tempList.size()/2));
				output.add(i, median);			
			}
			
		}
		return output;
	}
	
	public static void main(String[] args) {
		int[] a = {1,2};
		int[] b = {5,15,1,3};
		
		List<Integer> medianOfElementsInArray = Solution.getMedianOfElementsInArray(b);
		System.out.println(medianOfElementsInArray);
	}

}
