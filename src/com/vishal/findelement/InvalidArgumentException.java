package com.vishal.findelement;

public class InvalidArgumentException extends Exception {
	
	private static final long serialVersionUID = 1L;

	public String toString(){
		return "index out of range";
	}
}
