package com.vishal.myArrayList;

public class MyArrayList<T> {
	
	public static final int DEFAULT_ARRAY_SIZE = 10;
	private int arraySize = DEFAULT_ARRAY_SIZE;
	private T[] array;
	private T[] newArray;
	private int arrayMaxIndex; 
	
	@SuppressWarnings("unchecked")
	public MyArrayList(){
		array = (T[]) new Object[DEFAULT_ARRAY_SIZE];
	}
	
	@SuppressWarnings("unchecked")
	public void add(T obj){
		if(arrayMaxIndex  <= array.length-1){
			array[arrayMaxIndex++] = obj;
		}else{
			//copy the old array contents to new array of size: size*3/2+1
			arraySize *= 3/2+1;
			newArray = (T[])new Object[arraySize];
			for (int i = 0; i < array.length; i++) 
				newArray[i] = array[i];
			array = newArray;
			array[arrayMaxIndex++] = obj;
		}			
	}
	
	public void remove(int atIndex){
		T temp = null;
		array[atIndex] = null;
		while(array[atIndex+1] != null){
			atIndex++;
			temp = array[atIndex];
			atIndex--;
			array[atIndex+1] = array[atIndex];
			array[atIndex] = temp;
			atIndex++;
		}
		arrayMaxIndex--;		
	}
	
	public String toString(){
		String s = "";
		for (T t : array) {
			if(t==null) break;
			s += t + " ";
		}		
		return "[ " + s + "]";
		
	}
	
	public MyIterator<T> iterator(){
		return new MyIterator<T>(this.array);
	}

}
