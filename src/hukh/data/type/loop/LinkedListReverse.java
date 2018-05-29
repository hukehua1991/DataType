package hukh.data.type.loop;

import java.util.Arrays;

import hukh.data.type.comm.Node;
import hukh.data.type.recursion.LinkedListCreator;

public class LinkedListReverse {
	
	public Node reverse(Node head) {
		if (head == null)
			return head;
		
		Node newHead = head;
		Node current = head.getNext();
		
		while (current != null) {
			Node temp = null;
			temp = current.getNext();
			current.setNext(newHead);
			newHead = current;
			current = temp;
		}
		head.setNext(null); // 清理垃圾数据
		
		return newHead;
	}
	
	public static void main(String[] args) {
		LinkedListCreator listLink = new LinkedListCreator();
		LinkedListReverse listRvs = new LinkedListReverse();
		Node.printList(listRvs.reverse(listLink.creator(Arrays.asList())));
		Node.printList(listRvs.reverse(listLink.creator(Arrays.asList(1))));
		Node.printList(listRvs.reverse(listLink.creator(Arrays.asList(1, 2, 3, 4, 5))));
//		Node.printList(listLink.creator(Arrays.asList(1, 2, 3, 4, 5)));
	}

}
