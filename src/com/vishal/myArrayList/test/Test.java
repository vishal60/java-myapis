package com.vishal.myArrayList.test;
import com.vishal.myArrayList.*;

public class Test {

	public static void main(String[] args) {
		int temp = 0;
		
		MyArrayList<Object> mal = new MyArrayList<Object>();
		mal.add("vishal"+temp++);
		mal.add("vishal"+temp++);
		mal.add("vishal"+temp++);
		mal.add("vishal"+temp++);
		mal.add("vishal"+temp++);
		mal.add("vishal"+temp++);
		mal.add("vishal"+temp++);
		mal.add("vishal"+temp++);
		mal.add("vishal"+temp++);
		mal.add("vishal"+temp++);
		mal.add("vishaasdasl");
		mal.remove(2);
		mal.add("baba");
		mal.remove(7);
		mal.add('c');
		mal.add(1);
		mal.add(true);
		
		System.out.println(mal);
		
		MyIterator<Object> iterator = mal.iterator();
		while(iterator.hasNext())
			System.out.println(iterator.next());		
	}

}
