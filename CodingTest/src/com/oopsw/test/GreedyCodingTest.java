package com.oopsw.test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class GreedyCodingTest {

	public static void main(String[] args) {
		int n = 5;
		int[] lost = {2,4};
		int[] reserve = {1,3,5,2};
		int answer = n - lost.length;
		List lostList = new ArrayList();
		List reserveList = new ArrayList();
		for (int i = 0; i < lost.length; i++){
			lostList.add(lost[i]);
		}
		for (int i = 0; i < reserve.length; i++){
			reserveList.add(reserve[i]);
		}
		
		for (int i = 0; i < lost.length; i++){
			int upSize = lost[i]+1;
			int downSize = lost[i]-1;
			for (int j = 0; j < reserve.length; j++){
				if (reserve[j] == upSize){
					lostList.remove(i);
					reserve.remove(reserve);
				}else if (reserve[j] == downSize){
					lostList.remove(i);
				}
			}
		}
		
		
		
		        System.out.println(answer);
		}    
	}