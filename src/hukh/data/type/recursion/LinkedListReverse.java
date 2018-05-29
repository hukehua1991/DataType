package hukh.data.type.recursion;

import java.util.Arrays;

import hukh.data.type.comm.Node;

public class LinkedListReverse {
	
	Node reverse(Node head) {
		if (head == null || head.getNext() == null)
			return head;
		
		// 假设范围缩小1反转成功，范围新头节点
		Node newHead = reverse(head.getNext());
		
		head.getNext().setNext(head);
		head.setNext(null);
		return newHead;
	}
	
	public static void main(String[] args) {
		LinkedListCreator listLink = new LinkedListCreator();
		LinkedListReverse listReverse = new LinkedListReverse();
		Node.printList(listReverse.reverse(listLink.creator(Arrays.asList())));
		Node.printList(listReverse.reverse(listLink.creator(Arrays.asList(1))));
		Node.printList(listReverse.reverse(listLink.creator(Arrays.asList(1, 2, 3, 4, 5))));
	}

}
