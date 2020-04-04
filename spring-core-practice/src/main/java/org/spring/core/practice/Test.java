package org.spring.core.practice;
interface Myinterface{
	final int i=10;
}
class Derived{
	
}
class Base extends Derived{
	
}
public class Test {
	public static void main(String[] args) {
		int i=1; int j=9;
		
		do
			if(i++<j--) {
				continue;
			}
		while(i<5);
		
		System.out.println(i);
	}
}
