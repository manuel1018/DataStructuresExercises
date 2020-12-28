package com.juanma.HackAlgorithms.Algorithms;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class MergeSort {
	 	private int sortArray[];
	 	private int[] newArray;	
	    
	    public MergeSort(){
	        
	    }
	    
	    private int[] merge(int leftArray[],int rightArray[]){
	       int index=0;
	        newArray=new int[leftArray.length+ rightArray.length];
	       int indexLeft=0;
	       int indexRight=0;
	        while((indexRight!= rightArray.length)&&(indexLeft!= leftArray.length)){
	           if(leftArray[indexLeft]<rightArray[indexRight]){
	               newArray[index]=leftArray[indexLeft];
	               ++indexLeft;
	           }
	           else {
	               newArray[index] = rightArray[indexRight];
	               ++indexRight;
	           }
	            ++index;
	       }
	        for (int j=0;j< rightArray.length-(indexRight);j++){
	            newArray[index+j]=rightArray[j+indexRight];
	        }
	        for (int j=0;j< leftArray.length-(indexLeft);j++){
	            newArray[index+j]=leftArray[j+indexLeft];
	        }
	        return newArray;
	    }

	    private int[] divideArray(int array[],int limitInf,int limitSup){
	        int subArray[]=new int[limitSup-limitInf];
	        int index=0;
	        for(int i=limitInf;i< limitSup;i++){
	            subArray[index++]=array[i];
	        }
	        return subArray;
	    }
	    
	    public int[] sort(int sortArray[]){
	        if(sortArray.length<=1)
	            return sortArray;
	        int limit= sortArray.length/2;
	        int[] left=sort(divideArray(sortArray,0, limit));
	        int[]rigth=sort(divideArray(sortArray,limit, sortArray.length));
	        return merge(left,rigth);
	    }
	    
	    public void printList() {
	    	System.out.println(this);    	
	    }
	    
		@Override
		public String toString() {	
			List<Object>number=Arrays.stream(newArray).boxed().collect(Collectors.toList());
			return number.toString();
		}
}