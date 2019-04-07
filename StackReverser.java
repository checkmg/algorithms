package com.sforce.server.config;

import java.util.Random;
import java.util.Stack;

public class StackReverser {
	
	Stack<Integer> stack = new Stack();
	
	public static void main(String[] args) {
        Random rand = new Random();
        Stack<Integer> a=new Stack<Integer>();

        for (int i=0; i<10; i++){
            a.push(rand.nextInt(50));
        }

         System.out.println("List:");
         System.out.println(a);

         System.out.println("Reversed List:");
         //System.out.println(reverse(a));
         reverse(a);
         System.out.println(a);
	}
	
	public static void reverse(Stack<Integer> a) {
		if(a.isEmpty()) return;
		
		int x = a.peek();
		a.pop();
		reverse(a);
		insertToBottom(a, x);
	}
	
	public static void insertToBottom(Stack<Integer> a, Integer b) {
		if(a.isEmpty()) {
			a.push(b);
			return;
		} else {
		int temp = a.pop();
		insertToBottom(a, b);
		a.push(temp);}
	}

}
