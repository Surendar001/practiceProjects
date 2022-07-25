package com;

public class LongestincSubseq {
		   static int incre_subseq(int arr[], int arr_len){
		      int seq_arr[] = new int[arr_len];
		      int i, j, max = 0;
		      for (i = 0; i < arr_len; i++)
		         seq_arr[i] = 1;
		      for (i = 1; i < arr_len; i++)
		      for (j = 0; j < i; j++)
		      if (arr[i] > arr[j] && seq_arr[i] < seq_arr[j] + 1)
		      seq_arr[i] = seq_arr[j] + 1;
		      for (i = 0; i < arr_len; i++)
		      if (max < seq_arr[i])
		      max = seq_arr[i];
		      return max;
		   }
		   public static void main(String args[]){
		      int my_arr[] = { 5,10,40,28,94,57,60,75,85,43 };
		      int arr_len = my_arr.length;
		      System.out.println("The length of the longest increasing subsequence is " +  incre_subseq(my_arr, arr_len));
		   }
		}

