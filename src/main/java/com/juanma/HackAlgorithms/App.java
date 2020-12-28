package com.juanma.HackAlgorithms;

import com.juanma.HackAlgorithms.Algorithms.*;

public class App 
{
    public static void main( String[] args )
    {
    	int[]arraysForSorting=new int[] {10,57,2,10,9,4,99,1};
    	MergeSort array=new MergeSort();    
    	array.sort(arraysForSorting);
    	System.out.println("////Merge Method///");
    	array.printList();    	
    	System.out.println("////Stack check///");
    	StackCheck stack=new StackCheck();
    	System.out.println( stack.check("()+[]"));
    	System.out.println("////Tag Validator check///");
    	TagValidator tag=new TagValidator();
    	System.out.println( tag.isContenValid("<h1>Hello world</h1>"));
    }
}
