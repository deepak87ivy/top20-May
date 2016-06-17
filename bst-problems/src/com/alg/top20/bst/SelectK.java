package com.alg.top20.bst;

public class SelectK {
	
	static class MyInteger {
		int count;
		MyInteger(int count) {
			this.count = count; 
		}
		public void incr() {
			++count;
		}
		public int get() {
			return count;
		}
	}
	
	private static Integer auxselectK(TreeNode current, int k, MyInteger count) {
		if(current == null) return null;
		Integer tmp = auxselectK(current.left, k, count);
		if(tmp != null) return tmp;
		count.incr();
		if(count.get() == k) return current.data;
		return auxselectK(current.right, k, count);		
	}
	
	public static Integer selectK(TreeNode current, int k)  {
		MyInteger count = new MyInteger(0);
		return auxselectK(current, k, count);		
	}

}
