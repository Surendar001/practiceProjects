package com;

import java.util.ArrayList;
import java.util.List;

public class LISExample {
	static List<Integer> findLIS(int[] arr) {
        List<List<Integer>> lis = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            lis.add(new ArrayList<>());
        }

        lis.get(0).add(arr[0]);

        for (int i = 1; i < arr.length; i++) {
            for (int j = 0; j < i; j++) {
                if (arr[i] > arr[j] && lis.get(i).size() < lis.get(j).size() + 1) {
                    lis.set(i, new ArrayList<>(lis.get(j)));
                }
            }
            lis.get(i).add(arr[i]);
        }

        List<Integer> longest = lis.get(0);
        for (int i = 0; i < lis.size(); i++) {
            if (longest.size() < lis.get(i).size()) {
                longest = new ArrayList<>(lis.get(i));
            }
        }

        return longest;
    }

	public static void main(String[] args) {
		
		 int[] arr = {5,10,40,28,94,57,60,65,75,43,78,52,86,46,23,93};
	        System.out.println("The longest inc subsequence is"+findLIS(arr).toString());
	}

}
