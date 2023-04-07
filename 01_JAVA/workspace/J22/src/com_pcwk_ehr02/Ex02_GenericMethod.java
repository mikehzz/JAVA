package com_pcwk_ehr02;

import java.util.Arrays;

public class Ex02_GenericMethod {
	public static <T> void swap(T[] arr, int i, int j) {
		T temp  = arr[i];
		arr[i] = 		arr[j];
		arr[j]  = temp;
	}
	public static void main(String[] args) {
		Integer[] intArr= {1,2};
		swap(intArr,0,1);
		
		System.out.println(Arrays.toString(intArr));
		String[] stringArr = {"Hello","world"};
		swap(stringArr,0,1);
		System.out.println(Arrays.toString(stringArr));
		
	}

}
//[2, 1]
//[world, Hello]