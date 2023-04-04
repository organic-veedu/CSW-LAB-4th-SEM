package cswQuestions;
import java.util.LinkedList;
public class EXP {

	public static void main(String[] args) {
		LinkedList <Integer> ll = new LinkedList();
		ll.addFirst(58);
		ll.addLast(6);
		ll.addFirst(999);
		ll.addLast(11);
		System.out.println("Contents of LinkedList " + ll);
		ll.removeFirst();
		ll.removeLast();
		System.out.println("Content of LinkedList " + ll);
	}

}
