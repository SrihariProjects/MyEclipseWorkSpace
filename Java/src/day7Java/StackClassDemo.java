package day7Java;

import java.util.Stack;

public class StackClassDemo {

	public static void main(String[] args) {

		
		Stack<String>  books=new Stack<>();
		
		books.add(0,"Yellow");
		books.add("Red");
		books.set(0, "Pink");
		
		books.add("White");
		
//		System.out.println(books);
//		System.out.println(books.contains("Red"));
//		System.out.println(books.get(1));
		
		
		/*
		 * special methods for stacks are
		 *Push -- add the element at top of stack
		 *Pop -- removes the last added value
		 *Peek -- It will return the last added value
		 * search
		 */
		
		
		
		books.push("White");
		System.out.println(books);
		
//		System.out.println(books.peek());
		System.out.println(books.pop());
//		System.out.println(books.push("Green"));
//		
//		System.out.println(books.search("Pink"));
//		System.out.println(books.indexOf("Pink"));
//		
//		System.out.println(books.isEmpty());
		
//		System.out.println(books.peek());
		System.out.println(books);
		
	}

}
