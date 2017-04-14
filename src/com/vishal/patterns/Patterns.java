package com.vishal.patterns;

public class Patterns {	
	
	public static void selectPattern(int i, int size){
		switch (i) {
		case 1:
			house(size);
			break;
		case 2:
			numberTriangle(size);
			break;
		case 3:
			numberTriangleInverted(size);
			break;
		case 4:
			playTriangle(size);
			break;
		case 5:
			binaryTriangle(size);
			break;
		case 6:
			binaryRectangle(size);
			break;
		case 7:
			upperNumberTriangle(size);
			break;
		case 8:
			sizeNumberTriangle(size);
			break;
		case 9:
			twoTriangles1(size);
			break;
		case 10:
			twoTriangles2(size);
			break;
		case 11:
			upperLeft1sTriangle(size);
			break;
		case 12:
			palinTriangle(size);
			break;
		case 13:
			diagonalNumberRectangle(size);
			break;
		case 14:
			triangle1ton(size);
			break;
		case 15:
			timerPrism(size);
			break;
		default:
			System.out.println("Enter a valid input between 1 to 15");
			break;
		}
	}
	
	public static void house(int size) {
		int y = (size%2==0)?size:size+1; //only even nums
		int x = y-1; 
		
		int roofBottom = y/2; 
		int xMid = x/2+1;
		for(int i = 0; i<=roofBottom; i++){
			for(int j = 0; j<=x+1; j++)
				System.out.print( (i==roofBottom)?"*":((j>=xMid-i)&&(j<=xMid+i)?"*":" ") );
			System.out.println();
		}
		for(int i=0; i<=y/6; i++){
			for(int j=0; j<=x+1; j++)
				System.out.print( (j==1)||(j==x)?"*":" " );
			System.out.println();
		}
		for(int i=0; i<=y/3; i++){
			for(int j=0; j<x+1; j++)
				System.out.print( (i==y/3)? (j==0)?" ":"*" :((j==1)||(j>=xMid-x/8)&&(j<=xMid+x/8)||(j==x))?"*":" " );
			System.out.println();
		}
	}
	public static void numberTriangle (int size){
		int x = 1;
		for(int i=1; i<=size; i++){
			for(int j=1; j<=x; j++)
				System.out.print(j+" ");
			x++;
			System.out.println();
		}
	}
	public static void numberTriangleInverted (int size){
		int x = size;
		for(int i=1; i<=size; i++){
			for(int j=1; j<=x; j++)
				System.out.print(j+" ");
			x--;
			System.out.println();
		}
	}
	public static void playTriangle (int size){
		int x = 1;
		for(int i=1; i<=size; i++){
			for(int j=1; j<=x; j++)
				System.out.print(j+" ");
			x++;
			System.out.println();
		}
		x = size-1;
		for(int i=1; i<=size; i++){
			for(int j=1; j<=x; j++)
				System.out.print(j+" ");
			x--;
			System.out.println();
		}
	}
	public static void binaryTriangle (int size){
		int x = 1;
		for(int i=1; i<=size; i++){
			for(int j=1; j<=x; j++)
				System.out.print(j%2);
			x++;
			System.out.println();
		}
	}
	public static void binaryRectangle (int size){
		for(int i=1; i<=size; i++){
			for(int j=1; j<=size; j++)
				System.out.print((i%2==1)?j%2:(j+1)%2);
			System.out.println();
		}
	}
	public static void upperNumberTriangle (int size){
		int x = size;
		for(int i=1; i<=size; i++){
			for(int j=0; j<x; j++)
				System.out.print(size-j+" ");
			x--;
			System.out.println();
		}
	}
	public static void sizeNumberTriangle (int size){
		int x = size;
		for(int i=1; i<=size; i++){
			for(int j=size; j>=x; j--)
				System.out.print(j+" ");
			x--;
			System.out.println();
		}
	}
	public static void twoTriangles1 (int size){
		int x = size;
		for(int i=1; i<=size; i++){
			for(int j=1; j<=x; j++)
				System.out.print(j+" ");
			x--;
			System.out.println();
		}
		x = 2;
		for(int i=1; i<size; i++){
			for(int j=1; j<=x; j++)
				System.out.print(j+" ");
			x++;
			System.out.println();
		}
	}
	public static void twoTriangles2 (int size){
		int space = 0;
		for (int i=1; i<size; i++) {
			for (int j=1; j<=size; j++)
				System.out.print((j<=space)?" ":j);
			space++;
			System.out.println();
		}
		space = size-1; 
		for (int i=0; i<size; i++) {
			for (int j=1; j<=size; j++)
				System.out.print((j<=space)?" ":j);
			space--;
			System.out.println();
		}
	}
	public static void upperLeft1sTriangle (int size){
		int count =1;
		for (int i=1; i<=size; i++) {
			for (int j=0; j<size; j++) {
				System.out.print( (j<size-i)?1:count );
			}
			count++;
			System.out.println();
		}
	}
	public static void palinTriangle (int size){
		int x = 1;
		for(int i=1; i<=size; i++){
			for (int j=1; j<=x; j++) 
				System.out.print(j+" ");
			for (int j=x-1; j>0; j--) 
				System.out.print(j+" ");
			x++;
			System.out.println();
		}
	}
	public static void diagonalNumberRectangle (int size){
		int pos = 0;
		for (int i=1; i<=size; i++) {
			for (int j=0; j<size; j++) {
				System.out.print( (j==pos)?j:0 );
			}
			pos++;
			System.out.println();
		}
	}
	public static void triangle1ton (int size){
		int x = 0; int space =0;
		for (int i=1; i<=size; i++) {
			x=i;
			System.out.print(x+" ");
			for (int k=0; k<size-1; k++){
				if(k<space){
					x += size-1-k;
					System.out.print(x+" ");
				}else
					System.out.print(" ");
			}
			space++;
			System.out.println();
		}
	}
	public static void timerPrism (int size){
		int x = 1;
		for (int i=1; i<size; i++) {
			for (int k=1; k<=i; k++) {
				System.out.print(" ");
			}
			for (int j=x; j<=size; j++) {
				System.out.print(j+" ");
			}
			x++;
			System.out.println();
		}
		x = size;
		for (int i=1; i<=size; i++) {
			for (int k=size; k>=i; k--) {
				System.out.print(" ");
			}
			for (int j=x; j<=size; j++) {
				System.out.print(j+" ");
			}
			x--;
			System.out.println();
		}
	}
}
