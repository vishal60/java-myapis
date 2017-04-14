package com.vishal.findelementalgorithm;

public class FindElement {

	private static char[] ca;
	private static char[] caSemiFinal;
	private static char[] caFinal;
	
	public static String nonrepeatingElements(String s){
		int count = 0;
		ca = s.toCharArray();
		caSemiFinal = new char[ca.length];
		for(int i=0; i<s.length(); i++){
			for(int j=0; j<ca.length; j++){
				if(s.charAt(i)==ca[j]){
					caSemiFinal[i] = s.charAt(i);
					count++;
				}
				if(count>1){
					caSemiFinal[i] = '$';
					count=0;
					break;
				}
			}
			count=0;
		}
		for(char c:caSemiFinal){
			if(c=='$')
				count++;
		}
		
		String str = "";
		for(char c:caSemiFinal)
			str += c; 
		
		caFinal = new char[ca.length-count];
		int j=0;
		for(int i=0; i<str.length(); i++){
			if(caSemiFinal[i] !='$'){
				caFinal[j++]=caSemiFinal[i];
			}
		}
		
		String strFinal = "";
		for(char c:caFinal)
			strFinal += c; 
		
		return strFinal;
	}

	public static char nonrepeatingElementsAt(String string, int i) throws StringIndexOutOfBoundsException{
		return nonrepeatingElements(string).charAt(i-1);
	}
}
