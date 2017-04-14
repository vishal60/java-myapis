package com.vishal.myArrayList;

public class MyIterator<T> {
	private T[] array;
	private int iter;

	public MyIterator(T[] array){
		this.array = array;
	}
	
	public boolean hasNext(){		
		return (array[iter]==null)?false:true;		
	}
	
	public T next(){
		return array[iter++];		
	}
}
