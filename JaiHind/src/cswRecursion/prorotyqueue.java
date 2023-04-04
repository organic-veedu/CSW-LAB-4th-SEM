package cswRecursion;
import java.util.PriorityQueue;
import java.util.Collections;
public class prorotyqueue {

	public static void main(String[] args) {
		PriorityQueue<Integer> pq = new PriorityQueue<Integer> (Collections.reverseOrder());
		int[] arr = {1,2,10,8,7,3,4,6,5,9};
		for(int i: arr){
		pq.add(i);
		}
		System.out.println("Printing Priority Queue Heap : " + pq);
		System.out.print("remove elements of Priority Queue ::");
		while(pq.isEmpty() == false){
		System.out.print(" " + pq.remove());

	}

	}
	}
