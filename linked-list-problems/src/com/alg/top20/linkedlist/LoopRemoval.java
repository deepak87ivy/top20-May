package com.alg.top20.linkedlist;

import java.util.HashSet;
import java.util.Random;

public class LoopRemoval {


	public static boolean removeLoop1(ListNode head) {
		HashSet<ListNode> hs = new HashSet<ListNode>();
		ListNode current, prev = null;
		for(current = head.next; current != null; prev = current,current = current.next) {
			if(hs.contains(current)) {
				prev.next = null;
				return true;
			}
			else 
				hs.add(current);
		}
		return false;
	}
	

	//convert logic to C native method 
	public static boolean removeLoop2(ListNode head) {
		ListNode current, prev = null;
		for(current = head.next; current != null; prev = current,current = current.next) {
			if((Integer)current.next < 0) {
				prev.next = null;
				return true;
			}
			else 
				current.next *= -1;
		}
		return false;	
	}
	
	public static boolean removeLoop3(ListNode head) {
		ListNode slow, fast;
		slow = fast = head;
		do {
			slow = slow.next;
			if(fast== null || fast.next== null) return false; 
			fast = fast.next.next;
		} while(slow != fast);
		return true;	
	}
	
	public static void main(String[] args) {
		int n = Integer.parseInt(args[0]);
		ListNode head = new ListNode();
		ListNode last = head;
		for(int i = 0; i <  n; ++i) {
			ListNode tmp = new ListNode();
			last.next = tmp;
			last = tmp;
		}
		//System.out.println(hasLoop1(head));
		//System.out.println(hasLoop2(head));
		last.next = head.next;
		//System.out.println(hasLoop1(head));
		//System.out.println(hasLoop2(head));

		ListNode current;
		last.next = null;
		int r = new Random().nextInt(n);
		int count = 0;
		for(current = head.next; current!= null; current = current.next) {
			if(++count == r) {
				last.next = current;
				break;
			}
		}
		
		System.out.println(hasLoop1(head));
		System.out.println(hasLoop2(head));

	}


}
