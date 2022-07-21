package com.adavance.collections.linkedlist;
import java.util.Collections;
import java.util.LinkedList;

public class LinkedList {

	public static void main (String[] args) {
		
		LinkedList<String> morningRoutine =new LinkedList<>();
		morningRoutine.add("seeing");
		
		if(!morningRoutine.isEmpty()) {
			System.out.println("first element of the list:" +morningRoutine.getFirst());
		}
		if(!morningRoutine.isEmpty()&&morningRoutine.peekfirst()!=null) {
			System.out.println("first element of the list:"+ morningRoutine.peekFirst().toUpperCase());
		}
		morningRoutine.add("waking");
		morningRoutine.add("walking");
		morningRoutine.add("jogging");
		
		
		
		morningRoutine.add("waking");
		morningRoutine.addFirst("walking");
		morningRoutine.addoffer("jogging");
		
		System.out.println("used pop function:"+morningRoutine.pop());
		
		System.out.println("morningRoutine");
		
		System.out.println("first element on the list:" +morningRoutine.pollFirst());
		System.out.println("last element on the list:"+morningRoutine.pollLast());
		
		
		System.out.println("morningRoutine");
		

	}

}
