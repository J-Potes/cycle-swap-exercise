package com.epam.rd.autotasks;
import  java.util.Arrays;

class CycleSwap {
    static void cycleSwap(int[] array) {
    	CycleSwap.cycleSwap(array, 1);
    }

    static void cycleSwap(int[] array, int shift) {
    	
    	if(array.length != 0 && shift != 0) {
    		int[] newArray = new int[array.length];
        	System.arraycopy(array, (array.length - shift), newArray, 0, shift);
        	System.arraycopy(array, 0, newArray, shift, (array.length - shift));
        	
        	System.arraycopy(newArray,0,array,0,array.length);
    	}
    	
    }
}
