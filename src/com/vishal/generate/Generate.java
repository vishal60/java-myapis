package com.vishal.generate;

import java.util.ArrayList;

public class Generate {
	
	private static String[][] string;
	private static int noOfChars;
	private static int twoPowNoOfChars;
	private static int iter;
	
	private static int index1;
	private static int index2;
	private static int[] arrayOfSecondIndex;
	private static int makeStringLoop;
	private static String finalString;
	private static int temp;
	
	private static ArrayList<String> list;
	
	public static void allWords(String[][] string){
		Generate.list = new ArrayList<String>();
		Generate.string = string;
		Generate.noOfChars = string.length;
		Generate.twoPowNoOfChars = (int) Math.pow(2.0, noOfChars);
		arrayOfSecondIndex = new int[noOfChars+1];
		temp = twoPowNoOfChars * 2;
		
		for(int i=0; i<noOfChars; i++)
			for (int j = 0; j < twoPowNoOfChars; j++) {
				String str = makeString(i);
				list.add(str);
				iter = 0;
				Generate.makeStringLoop=0;
				index1 = 0;
				temp = twoPowNoOfChars * 2;
			}	
	}

	private static String makeString(int i) {
		index1 = (i+index1)%noOfChars;
		temp = temp / 2;
		index2 = ( (arrayOfSecondIndex[iter++]++)%(temp) < (temp/2))?0:1;
		
		if(makeStringLoop==noOfChars){return "";}
		
		while(makeStringLoop<noOfChars){
			makeStringLoop++;
			finalString = string[index1++][index2] + makeString(0);
		}
		
		return finalString;
	}
	
	public static String findWord(String word){
		return (list.contains(word)) ? 
				"found "+word+" at index "+(list.indexOf(word)+1) :
				word+" Not found in the list generated";
	}
	
	public static void printList(){
		for(int i=0; i<list.size(); i++)
			System.out.println((list.indexOf(list.get(i))+1)+" "+list.get(i));
	}
	
}
