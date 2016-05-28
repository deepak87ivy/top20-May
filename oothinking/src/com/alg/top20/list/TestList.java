package com.alg.top20.list;

public class TestList {
	
	public static void test1(IList list) {
		list.add(10);
		list.add(20);
		list.display();
	}

	public static void main(String[] args) {
	    ArrayList al = new ArrayList();
	/*	al.add(10);
			al.add(20);
		al.display(); */
		
		LinkedList ll = new LinkedList();
		/*ll.add(40);
		ll.add(50);
		ll.display();*/
		test1(al);
		test1(ll);
	}

}
